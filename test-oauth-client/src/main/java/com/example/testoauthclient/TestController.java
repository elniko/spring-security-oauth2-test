package com.example.testoauthclient;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.oauth2.client.OAuth2RestTemplate;
import org.springframework.security.web.authentication.logout.CookieClearingLogoutHandler;
import org.springframework.security.web.authentication.logout.SecurityContextLogoutHandler;
import org.springframework.security.web.authentication.rememberme.AbstractRememberMeServices;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.view.RedirectView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.UnsupportedEncodingException;
import java.util.Base64;

@RestController
public class TestController {

    @Autowired
    OAuth2RestTemplate restTemplate;

    @Value("${security.oauth2.client.clientId}")
    private String clientId;

    @Value("${security.oauth2.client.clientSecret}")
    private String clientSecret;

    //@PreAuthorize("hasRole('ROLE_USER')")
    @GetMapping(value = "/getAccounts")
    public String getValue() {

      //  restTemplate.getAccessToken().getValue();
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        headers.set("PSU-Account-Consent-Responsibility", "BY-AISP");
        headers.set("Signature", "SN=XXX,CA=YYYYYYYYYYYYYYYY");
        headers.set("X-Request-ID", "lol");
        HttpEntity he = new HttpEntity(headers);
        return restTemplate.exchange("https://localhost:8083/accounts", HttpMethod.GET, he, String.class).getBody();
        //return restTemplate.getForEntity("https://localhost:8083/accounts", String.class).getBody();
    }

    @GetMapping("/login")
    public String login() {

        return restTemplate.getAccessToken().getValue();
    }

    @GetMapping(value = "/callback", produces = "text/html")
    public String getCallback() {
        return "<html>" +
                    "<body>" +
                        "<div>" +
                            "Logged In, access code:" +  restTemplate.getAccessToken().getValue() +
                        "</div>" +
                        "<div>" +
                            "<a href='/getAccounts'> Get User Accounts </a>" +
                        "</div>" +
                "<div>" +
                "<a href='/logout'> Logout</a>" +
                "</div>" +
                    "</body>" +
                "</html>";
    }


    @GetMapping("/logoutSuccess")
    public String loggedOut() {
        return "Logged out";
    }

    @GetMapping("/logout")
    public RedirectView logout() throws UnsupportedEncodingException {
        String accessToken = restTemplate.getAccessToken().getValue();
        String revokeLink = "https://localhost:9443/oauth2/revoke";
        RestTemplate rt = new RestTemplate();
        MultiValueMap<String, String> formData = new LinkedMultiValueMap();
        formData.add("token", accessToken);
        formData.add("token_type_hint" , "access_token");
        HttpHeaders headers = new HttpHeaders();
        String creds = clientId+":"+clientSecret;
        headers.set("Authorization", "Basic " + new String(Base64.getEncoder().encode(creds.getBytes("UTF-8"))));
        headers.setContentType(MediaType.APPLICATION_FORM_URLENCODED);
        rt.exchange(revokeLink, HttpMethod.POST, new HttpEntity(formData, headers), String.class);
        return new RedirectView("https://localhost:9443/oidc/logout");
    }



}
