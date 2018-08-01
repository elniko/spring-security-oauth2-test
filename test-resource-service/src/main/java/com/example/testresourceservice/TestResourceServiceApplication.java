package com.example.testresourceservice;

import com.example.testresourceservice.config.UserDetailsOzone;
import com.example.testresourceservice.config.UserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Profile;

@SpringBootApplication
public class TestResourceServiceApplication {

    @Profile("user")
    @Bean
    CommandLineRunner lol(UserRepository ur) {
        return args -> {
            UserDetailsOzone user = new UserDetailsOzone();
            user.setSub("admin");
            user.setFirstName("Chuck");
            user.setLastName("Norris");
            user.getRoles().add("ROLE_ADMIN");
            ur.save(user);


        };
    }

    public static void main(String[] args) {
        SpringApplication.run(TestResourceServiceApplication.class, args);
    }
}
