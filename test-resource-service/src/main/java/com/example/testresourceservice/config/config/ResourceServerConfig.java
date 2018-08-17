package com.example.testresourceservice.config.config;

import com.example.testresourceservice.config.UserService;
import com.example.testresourceservice.config.custom.CustomUserAuthenticationConverter;
import com.example.testresourceservice.config.custom.UserInfoTokenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.core.session.SessionRegistry;
import org.springframework.security.core.session.SessionRegistryImpl;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;
import org.springframework.security.oauth2.config.annotation.web.configuration.ResourceServerConfigurerAdapter;
import org.springframework.security.oauth2.config.annotation.web.configurers.ResourceServerSecurityConfigurer;
import org.springframework.security.oauth2.provider.token.*;

@Configuration
@EnableResourceServer
@EnableGlobalMethodSecurity(prePostEnabled = true)
public class ResourceServerConfig extends ResourceServerConfigurerAdapter {


    @Value("${resource.server.introspect.link}")
    private String introspectUrl;
    @Value("${resource.server.introspect.user}")
    private String introspectUser = "admin";
    @Value("${resource.server.introspect.password}")
    private String introspectPassword;
    @Value("${resource.server.userinfo.link}")
    private String userInfoUrl;

    @Autowired
    UserService userDetailsService;

    @Override
    public void configure(HttpSecurity http) throws Exception {
        http.authorizeRequests().anyRequest().permitAll().and()
                .sessionManagement()

                .maximumSessions(1)
                .sessionRegistry(sessionRegistry());
                //.sessionCreationPolicy(SessionCreationPolicy.IF_REQUIRED)

                //.and()
                //.csrf().disable();
    }

    @Override
    public void configure(final ResourceServerSecurityConfigurer config) {
        //DefaultTokenServices defaultTokenServices = new DefaultTokenServices();
        //defaultTokenServices.setTokenStore(tokenStore());
        config.tokenServices(tokenService());
    }

    @Bean
    public SessionRegistry sessionRegistry() {
        return new SessionRegistryImpl();
    }


    @Bean
    public UserInfoTokenService tokenService() {
        RemoteTokenServices rd = new RemoteTokenServices();
        UserInfoTokenService tokenService = new UserInfoTokenService();
        tokenService.setIntrospectUser(introspectUser);
        tokenService.setIntrospectPassword(introspectPassword);
        tokenService.setIntrospectUrl(introspectUrl);
        tokenService.setUserInfoUrl(userInfoUrl);
        tokenService.setAccessTokenConverter(accessTokenConverter());
        return tokenService;
    }

    @Bean
    public AccessTokenConverter accessTokenConverter() {
        DefaultAccessTokenConverter converter = new DefaultAccessTokenConverter();
        converter.setUserTokenConverter(userTokenConverter());
        return converter;
    }

    @Bean
    public UserAuthenticationConverter userTokenConverter() {
        CustomUserAuthenticationConverter converter = new CustomUserAuthenticationConverter();
        converter.setUserDetailsService(userDetailsService);
        return converter;
    }


}
