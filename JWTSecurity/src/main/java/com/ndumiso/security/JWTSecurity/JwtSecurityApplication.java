package com.ndumiso.security.JWTSecurity;

import com.ndumiso.security.JWTSecurity.entity.authentication.Role;
import com.ndumiso.security.JWTSecurity.entity.authentication.UserRole;
import com.ndumiso.security.JWTSecurity.entity.authentication.Users;
import com.ndumiso.security.JWTSecurity.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import java.util.Arrays;
import java.util.HashSet;

@SpringBootApplication
@EnableJpaRepositories
public class JwtSecurityApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(JwtSecurityApplication.class);
    }

    @Autowired
    private UserRepository userRepository;

    @Override
    public void run(String... args) throws Exception {
        userRepository.save(Users.builder().active(1)
                .email("ndumisosizwe@gmail.com")
                .lastName("mhlongo")
                .name("ndumiso")
                .password("password")
                .roles(new HashSet<>(Arrays.asList(Role.builder().name(UserRole.ADMIN).build(),
                        Role.builder().name(UserRole.ADMIN).build())))
                .build()
            );
    }
}