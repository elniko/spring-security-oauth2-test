package com.example.testresourceservice.config.config;

import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
public class TokenHolder {

    private Map<String, String> tokenMap = new HashMap<>();

    public String getToken(String key) {
        return tokenMap.get(key);
    }

    public void setToken(String key, String value) {
        tokenMap.put(key, value);
    }

}
