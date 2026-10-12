package com.example.userservice.service;

import com.example.userservice.dto.LoginRequest;
import com.example.userservice.dto.LoginResponse;
import com.example.userservice.security.JwtService;

import lombok.RequiredArgsConstructor;

import org.springframework.stereotype.Service;


@Service
@RequiredArgsConstructor
public class AuthService {


    private final JwtService jwtService;


    public LoginResponse login(LoginRequest request) {


        String token =
                jwtService.generateToken(
                        request.getUsername()
                );


        return new LoginResponse(token);
    }
}