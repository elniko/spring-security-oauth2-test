package com.example.testoauthclient;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.*;
import org.springframework.core.Ordered;
import org.springframework.http.client.SimpleClientHttpRequestFactory;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.oauth2.client.OAuth2ClientContext;
import org.springframework.security.oauth2.client.OAuth2RestTemplate;
import org.springframework.security.oauth2.client.filter.OAuth2ClientContextFilter;
import org.springframework.security.oauth2.client.resource.OAuth2ProtectedResourceDetails;
import org.springframework.security.oauth2.client.token.AccessTokenProvider;
import org.springframework.security.oauth2.client.token.AccessTokenProviderChain;
import org.springframework.security.oauth2.client.token.grant.code.AuthorizationCodeAccessTokenProvider;
import org.springframework.security.oauth2.client.token.grant.code.AuthorizationCodeResourceDetails;
import org.springframework.security.oauth2.common.AuthenticationScheme;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableOAuth2Client;
import org.springframework.security.web.RedirectStrategy;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.filter.CorsFilter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.util.Arrays;

import static com.example.testoauthclient.TrustModifier.relaxHostChecking;

@Configuration
@EnableOAuth2Client
@EnableWebSecurity
@EnableGlobalMethodSecurity(prePostEnabled = true)
public class MyConfig extends WebSecurityConfigurerAdapter {
    @Value("${security.oauth2.client.clientId}")
    private String clientId;

    @Value("${security.oauth2.client.clientSecret}")
    private String clientSecret;

    @Value("${security.oauth2.client.accessTokenUri}")
    private String accessTokenUri;

    @Value("${security.oauth2.client.userAuthorizationUri}")
    private String userAuthorizationUri = "https://localhost:9443/oauth2/authorize";

    @Value("${security.oauth2.client.pre-established-redirect-uri}")
    private String callbackUri = "http://localhost:8084/api/callback";

    @Override
    public void configure(final WebSecurity web) throws Exception {
        web.ignoring().antMatchers("/**");
    }

    @Override
    protected void configure(final HttpSecurity http) throws Exception {
        http.authorizeRequests().anyRequest().permitAll()
                //.and()
                //.logout()
                //.logoutUrl("/logout")
                //.deleteCookies("JSESSIONID")
                //.invalidateHttpSession(true)
                .and().csrf().disable()

       ;

      //  super.configure(http);
    }

    @Bean
    public FilterRegistrationBean corsFilterRegistrationBean() {
        UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
        CorsConfiguration config = new CorsConfiguration();
        config.setAllowCredentials(true);
        config.addAllowedOrigin("*");
        config.addAllowedHeader("*");
        config.addAllowedMethod("*");
        source.registerCorsConfiguration("/**", config);
        FilterRegistrationBean bean = new FilterRegistrationBean(new CorsFilter(source));
        bean.setOrder(Ordered.HIGHEST_PRECEDENCE);
        return bean;
    }

    @Bean
    public FilterRegistrationBean oauth2ClientFilterRegistration(OAuth2ClientContextFilter filter) {
        filter.setRedirectStrategy(null);
        FilterRegistrationBean registration = new FilterRegistrationBean();
        registration.setFilter(filter);
       // registration.setOrder(-100);
        return registration;
    }

    @Primary
    @Bean
    OAuth2ClientContextFilter oauth2ClientContextFilter() {
        OAuth2ClientContextFilter oAuth2ClientContextFilter = new OAuth2ClientContextFilter();
        oAuth2ClientContextFilter.setRedirectStrategy(new RedirectStrategy() {
            @Override
            public void sendRedirect(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, String s) throws IOException {
                httpServletResponse.setStatus(401);
            }
        });
        return oAuth2ClientContextFilter;
    }




    @Bean
    public OAuth2ProtectedResourceDetails oAuth2ProtectedResourceDetails() {
        AuthorizationCodeResourceDetails details = new AuthorizationCodeResourceDetails();
            details.setClientId(clientId);
        details.setClientSecret(clientSecret);
        details.setAccessTokenUri(accessTokenUri);
        details.setUserAuthorizationUri(userAuthorizationUri);
        details.setPreEstablishedRedirectUri(callbackUri);
        details.setUseCurrentUri(false);
        details.setScope(Arrays.asList("openid"));
        return details;
    }



    @Bean
    @Scope(
            value = "session",
            proxyMode = ScopedProxyMode.TARGET_CLASS
    )
    public OAuth2RestTemplate createRestTemplate(OAuth2ClientContext clientContext)  {
        OAuth2RestTemplate template = new OAuth2RestTemplate(oAuth2ProtectedResourceDetails(), clientContext);
        AuthorizationCodeAccessTokenProvider actp = new AuthorizationCodeAccessTokenProvider();
        actp.setStateMandatory(false);
        AccessTokenProviderChain accessTokenProvider = new AccessTokenProviderChain(
                Arrays.<AccessTokenProvider>asList(actp)
        );
        template.setRequestFactory(new MySimpleClientHttpRequestFactory() {
            @Override
            protected void prepareConnection(HttpURLConnection connection, String httpMethod) throws IOException {
                try {
                    relaxHostChecking(connection);
                } catch (Exception e) {
                    e.printStackTrace();
                }

                super.prepareConnection(connection, httpMethod);
                connection.setInstanceFollowRedirects(false);
            }
        });
        //accessTokenProvider.setClientTokenServices(oAuth2ClientTokenService);
        template.setAccessTokenProvider(accessTokenProvider);

        return template;
    }

}
