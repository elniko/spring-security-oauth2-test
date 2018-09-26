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

            UserDetailsOzone user2 = new UserDetailsOzone();
            user2.setSub("trump");
            user2.setFirstName("Donald");
            user2.setLastName("Trump");
            user2.getRoles().add("ROLE_ADMIN");
            ur.save(user2);

            UserDetailsOzone user3 = new UserDetailsOzone();
            user3.setSub("putin");
            user3.setFirstName("Vladimir");
            user3.setLastName("Putin");
            user3.getRoles().add("ROLE_ADMIN");
            ur.save(user3);

        };
    }

    public static void main(String[] args) {
        SpringApplication.run(TestResourceServiceApplication.class, args);
    }
}
