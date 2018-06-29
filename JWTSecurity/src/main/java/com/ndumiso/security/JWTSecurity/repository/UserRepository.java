package com.ndumiso.security.JWTSecurity.repository;

import com.ndumiso.security.JWTSecurity.entity.authentication.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, String> {

    Optional<User> findByName(String name);
}
