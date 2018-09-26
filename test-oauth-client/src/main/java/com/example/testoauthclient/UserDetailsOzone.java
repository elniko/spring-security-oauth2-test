package com.example.testoauthclient;

import lombok.Data;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

@Data
public class UserDetailsOzone {

    private Long id;
    private String sub;
    private String firstName;
    private String lastName;

    private Long exp;
    private Long iat;
    private String clientId;

    private List<String> roles = new ArrayList<>();

    public String getPassword() {
        return null;
    }

    public String getUsername() {
        return sub;
    }

    public boolean isAccountNonExpired() {
        return true;
    }

    public boolean isAccountNonLocked() {
        return true;
    }

    public boolean isCredentialsNonExpired() {
        return true;
    }

    public boolean isEnabled() {
        return true;
    }
}
