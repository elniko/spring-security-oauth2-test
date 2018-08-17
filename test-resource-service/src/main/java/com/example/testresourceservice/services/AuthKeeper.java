package com.example.testresourceservice.services;

import com.example.testresourceservice.config.UserDetailsOzone;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Component;

@Component
public class AuthKeeper {

    public Authentication getAuthentication() {
        return SecurityContextHolder.getContext().getAuthentication();
    }

    public UserDetailsOzone getCurrentUser() {
        return (UserDetailsOzone) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
    }


}
