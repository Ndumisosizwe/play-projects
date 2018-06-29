package com.ndumiso.security.JWTSecurity.rest;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest/hello")
public class HelloResource {

    @GetMapping("/all")
    public String hello() {
        return "Hello user";
    }

    @PreAuthorize("hasAnyAuthority(\"ADMIN\")")
    @GetMapping("/secure/all")
    public String secureHello() {
        return "secured Hello";
    }
}
