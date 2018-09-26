package com.example.testresourceservice.config.custom;

import com.example.testresourceservice.config.UserDetailsOzone;
import lombok.Setter;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.oauth2.provider.token.UserAuthenticationConverter;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;

public class CustomUserAuthenticationConverter implements UserAuthenticationConverter {

    @Setter
    private UserDetailsService userDetailsService;

    @Override
    public Map<String, ?> convertUserAuthentication(Authentication authentication) {
        throw new UnsupportedOperationException("Not supported: read access token");
    }

    @Override
    public Authentication extractAuthentication(Map<String, ?> map) {
        if (map.containsKey("sub")) {
            Object principal = map.get("sub");
            Collection<? extends GrantedAuthority> authorities = new ArrayList<>();
            if (this.userDetailsService != null) {
                UserDetailsOzone user = (UserDetailsOzone) this.userDetailsService.loadUserByUsername((String)map.get("sub"));
                if(user == null)
                    throw new RuntimeException("User not exists in the DB");
                user.setExp(new Long(map.get("exp")+""));
                user.setIat(new Long(map.get("iat")+""));
                user.setClientId((String) map.get("client_id"));
                user.setAccessToken((String)map.get("accessToken"));
                authorities = user.getAuthorities();
                principal = user;
            }
            return new UsernamePasswordAuthenticationToken(principal, "N/A", authorities);
        } else {
            return null;
        }
    }
}
