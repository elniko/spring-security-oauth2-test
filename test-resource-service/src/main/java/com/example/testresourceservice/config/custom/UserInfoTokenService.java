package com.example.testresourceservice.config.custom;

import lombok.Setter;
import org.springframework.http.*;
import org.springframework.security.oauth2.common.OAuth2AccessToken;
import org.springframework.security.oauth2.common.exceptions.InvalidTokenException;
import org.springframework.security.oauth2.provider.OAuth2Authentication;
import org.springframework.security.oauth2.provider.token.AccessTokenConverter;
import org.springframework.security.oauth2.provider.token.ResourceServerTokenServices;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestTemplate;

import java.io.UnsupportedEncodingException;
import java.util.Base64;
import java.util.HashMap;
import java.util.Map;

public class UserInfoTokenService implements ResourceServerTokenServices {

    @Setter
    private String introspectUrl;
    @Setter
    private String introspectUser;
    @Setter
    private String introspectPassword;
    @Setter
    private String userInfoUrl;

    private RestTemplate restTemplate = new RestTemplate();

    @Setter
    private AccessTokenConverter accessTokenConverter;


    @Override
    public OAuth2Authentication loadAuthentication(String accessToken) {
        Map<String, Object> wsoIntrospectResponse = getWsoIntrospectResponse(accessToken);

        if(!wsoIntrospectResponse.containsKey("active") || wsoIntrospectResponse.get("active") != Boolean.TRUE) {
               throw new InvalidTokenException(accessToken);
        }
        Map<String, Object> res = new HashMap<>(wsoIntrospectResponse);

        HttpHeaders headers = new HttpHeaders();
        headers.set("Authorization", "Bearer " + accessToken);
        Map map = restTemplate.exchange(userInfoUrl, HttpMethod.GET, new HttpEntity<>(headers), Map.class).getBody();
        if (map.containsKey("error") || !map.containsKey("sub")) {
            throw new InvalidTokenException(accessToken);
        }
        res.put("sub", map.get("sub"));

        return accessTokenConverter.extractAuthentication(res);
    }

    private Map<String, Object> getWsoIntrospectResponse(String accessToken) {
        MultiValueMap<String, String> formData = new LinkedMultiValueMap();
        formData.add("token", accessToken);
        HttpHeaders headers = new HttpHeaders();
        headers.set("Authorization", this.getAuthorizationHeader(introspectUser, introspectPassword));
        headers.setContentType(MediaType.APPLICATION_FORM_URLENCODED);
        return this.restTemplate.exchange(introspectUrl, HttpMethod.POST, new HttpEntity(formData, headers), Map.class, new Object[0]).getBody();
    }

    private String getAuthorizationHeader(String clientId, String clientSecret) {
        String creds = String.format("%s:%s", clientId, clientSecret);
        try {
            return "Basic " + new String(Base64.getEncoder().encode(creds.getBytes("UTF-8")));
        } catch (UnsupportedEncodingException var5) {
            throw new IllegalStateException("Could not convert String");
        }
    }

    @Override
    public OAuth2AccessToken readAccessToken(String s) {
        throw new UnsupportedOperationException("Not supported: read access token");
    }

}
