package com.example.userservice.controller;

import com.example.userservice.service.ProductClient;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
@RequiredArgsConstructor
public class UserController {

    private final ProductClient productClient;

    @GetMapping
    public String getUser() {
        return productClient.getProducts();
    }
}

