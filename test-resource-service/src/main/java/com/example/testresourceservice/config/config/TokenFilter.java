package com.example.testresourceservice.config.config;

import com.example.testresourceservice.config.UserDetailsOzone;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Component;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

//@Component
public class TokenFilter implements Filter {



    @Autowired
    TokenHolder tokenHolder;

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {

        HttpServletRequest request = (HttpServletRequest)servletRequest;
        HttpServletResponse response = (HttpServletResponse) servletResponse;
        if("/payment-requests".equals(request.getServletPath())) {
            UserDetailsOzone user = (UserDetailsOzone) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
            user.incCount();
            HttpSession session = request.getSession(false);
            System.out.println(session.getAttribute("lol"));

            session.setAttribute("lol", "lol");

            String oldToken = tokenHolder.getToken(user.getSub());
            if(oldToken == null) {
                tokenHolder.setToken(user.getSub(), user.getAccessToken());
                response.setStatus(401);
                return;
            }

            if(oldToken.equals(user.getAccessToken())) {
                response.setStatus(401);
                return;
            }



//            String oldToken = tokenHolder.getToken(user.getSub());
//
//            if(oldToken == null) {
//                tokenHolder.setToken(user.getSub(), user.getAccessToken());
//                response.setStatus(401);
//                return;
//            }
//
//            if(oldToken.equals(user.getAccessToken())) {
//                response.setStatus(401);
//                return;
//            }

        }
        filterChain.doFilter(servletRequest, servletResponse);
    }

    @Override
    public void destroy() {

    }
}
