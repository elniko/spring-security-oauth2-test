package com.example.testoauthclient;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.oauth2.client.OAuth2RestTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @Autowired
    OAuth2RestTemplate restTemplate;

    @GetMapping("/get")
    public String getValue() {
      //  restTemplate.getAccessToken().getValue();
        return restTemplate.getForEntity("https://localhost:8083/test", String.class).getBody();
    }

    @GetMapping("/callback")
    public String getCallback() {
        return "Logged In, access code:" +  restTemplate.getAccessToken().getValue();
    }

    @GetMapping("/lol")
    public String test() {
        return restTemplate.getAccessToken().getValue();
    }

}
