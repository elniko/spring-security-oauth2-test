package com.example.testresourceservice.config;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

@Entity
@Data
@EqualsAndHashCode(of = "sub")
public class UserDetailsOzone implements UserDetails {

    @Id
    @GeneratedValue
    private Long id;
    private String sub;
    private String firstName;
    private String lastName;

    @Transient
    private Long exp;
    @Transient
    private Long iat;
    @Transient
    private String clientId;
    @Transient
    private String accessToken;

    @Transient
    private int paymentCount = 0;

    @ElementCollection(fetch = FetchType.EAGER)
    private List<String> roles = new ArrayList<>();

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return roles
                .stream()
                .map(role-> (GrantedAuthority)() -> role)
                .collect(Collectors.toList());
    }

    @Override
    public String getPassword() {
        return null;
    }

    @Override
    public String getUsername() {
        return sub;
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }

    public void incCount() {
        paymentCount ++;
    }
}
