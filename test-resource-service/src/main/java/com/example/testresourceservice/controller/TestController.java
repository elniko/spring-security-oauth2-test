package com.example.testresourceservice.controller;

import com.example.testresourceservice.config.UserDetailsOzone;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.web.servlet.server.Session;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.session.SessionRegistry;
import org.springframework.security.web.authentication.logout.SecurityContextLogoutHandler;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.UnsupportedEncodingException;
import java.util.Base64;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@RestController
public class TestController {

    @Autowired
    @Qualifier("sessionRegistry")
    private SessionRegistry sessionRegistry;

    @RequestMapping("/login")
    public String test() {
        final String username = SecurityContextHolder.getContext().getAuthentication().getName();
        return username + " ";
    }

    @PreAuthorize("hasRole('ROLE_ADMIN')")
    @RequestMapping("/users")
    public List<Object> getLoggedUsers() {
        List<Object> principals = sessionRegistry.getAllPrincipals()
                .stream()
                .distinct()
                .map(UserDetailsOzone.class::cast)
                .filter(u -> !sessionRegistry.getAllSessions(u, false).isEmpty())
                .collect(Collectors.toList());
        return principals;
    }

    @RequestMapping("/currentUser")
    public UserDetailsOzone getCurrentUser() {
        return (UserDetailsOzone) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
    }

    @GetMapping("/logoutLink")
    public String govno(HttpServletRequest request, HttpServletResponse response) {
        Authentication auth = SecurityContextHolder.getContext().getAuthentication();

        if (auth != null){
            sessionRegistry.removeSessionInformation(request.getSession(false).getId());
            new SecurityContextLogoutHandler().logout(request, response, auth);
        }
        return "logout";
    }

    @GetMapping("/govno")
    public String g(HttpServletRequest req) {
        return "govno";
    }


}
