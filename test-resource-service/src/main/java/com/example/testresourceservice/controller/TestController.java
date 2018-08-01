package com.example.testresourceservice.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    //@PreAuthorize("#oauth2.hasScope('openid')")
    //@PreAuthorize("#oauth2.clientHasAnyRole('ROLE_USER')")
    @PreAuthorize("hasRole('ROLE_ADMIN')")
    @RequestMapping("/test")
    public String test() {
        final String username = SecurityContextHolder.getContext().getAuthentication().getName();
        return username;
    }
}
