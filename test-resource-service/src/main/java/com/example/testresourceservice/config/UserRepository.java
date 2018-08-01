package com.example.testresourceservice.config;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<UserDetailsOzone, Long> {
    UserDetailsOzone findUserBySub(String s);
}
