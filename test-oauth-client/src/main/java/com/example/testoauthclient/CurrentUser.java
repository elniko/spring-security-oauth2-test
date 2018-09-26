package com.example.testoauthclient;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.http.HttpMethod;
import org.springframework.security.oauth2.client.OAuth2RestTemplate;
import org.springframework.stereotype.Component;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.annotation.SessionScope;


@Component
@Scope( value= WebApplicationContext.SCOPE_SESSION,
        proxyMode = ScopedProxyMode.TARGET_CLASS )
public class CurrentUser {

    //private static String BASE_URL= "http://192.19.160.241:8281/rs/V1.0";
    private static String BASE_URL= "http://localhost:8083";

    public CurrentUser() {
        System.out.println("Create User");
    }

    @Autowired
    private OAuth2RestTemplate restTemplate;

    private UserDetailsOzone user;

    public void resetUser() {
        user = null;
    }

    public UserDetailsOzone getCurrentUser() {
//        if(user != null) {
//            return user;
//        }
        user = restTemplate.exchange(BASE_URL +"/currentUser", HttpMethod.GET, null, UserDetailsOzone.class).getBody();
        return user;
    }


}
