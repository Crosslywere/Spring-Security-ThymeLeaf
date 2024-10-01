package com.test.security.service;

import org.springframework.security.core.userdetails.UserDetails;

import java.util.Map;

public interface JwtService {

    default String generateToken(UserDetails userDetails) {
        return generateToken(Map.of(), userDetails);
    }

    String generateToken(Map<String, Object> claims, UserDetails userDetails);

    String extractSubject(String token);

    boolean isTokenValid(String token, UserDetails userDetails);

}
