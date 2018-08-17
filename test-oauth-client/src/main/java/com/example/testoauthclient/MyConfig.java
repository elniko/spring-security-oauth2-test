package com.example.testoauthclient;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.client.SimpleClientHttpRequestFactory;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.oauth2.client.OAuth2ClientContext;
import org.springframework.security.oauth2.client.OAuth2RestTemplate;
import org.springframework.security.oauth2.client.resource.OAuth2ProtectedResourceDetails;
import org.springframework.security.oauth2.client.token.AccessTokenProvider;
import org.springframework.security.oauth2.client.token.AccessTokenProviderChain;
import org.springframework.security.oauth2.client.token.grant.code.AuthorizationCodeAccessTokenProvider;
import org.springframework.security.oauth2.client.token.grant.code.AuthorizationCodeResourceDetails;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableOAuth2Client;

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
    private String userAuthorizationUri;

    //@Value("${security.oauth2.client.pre-established-redirect-uri}")
    private String callbackUri = "http://localhost:8084/callback";

    @Override
    public void configure(final WebSecurity web) throws Exception {
        web.ignoring().antMatchers("/**");
    }

    @Override
    protected void configure(final HttpSecurity http) throws Exception {
        http.authorizeRequests().anyRequest().authenticated()
                .and()
                .logout()
                .logoutUrl("/logout")
                .deleteCookies("JSESSIONID")
                .invalidateHttpSession(true)
       ;

      //  super.configure(http);
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
    public OAuth2RestTemplate createRestTemplate(OAuth2ClientContext clientContext)  {
        OAuth2RestTemplate template = new OAuth2RestTemplate(oAuth2ProtectedResourceDetails(), clientContext);
        AccessTokenProviderChain accessTokenProvider = new AccessTokenProviderChain(
                Arrays.<AccessTokenProvider>asList(new AuthorizationCodeAccessTokenProvider())
        );
        template.setRequestFactory(new SimpleClientHttpRequestFactory() {
            @Override
            protected void prepareConnection(HttpURLConnection connection, String httpMethod) throws IOException {
                try {
                    relaxHostChecking(connection);
                } catch (Exception e) {
                    e.printStackTrace();
                }
                super.prepareConnection(connection, httpMethod);
            }
        });
        //accessTokenProvider.setClientTokenServices(oAuth2ClientTokenService);
        template.setAccessTokenProvider(accessTokenProvider);

        return template;
    }

}
