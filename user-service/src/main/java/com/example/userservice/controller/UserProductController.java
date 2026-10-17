package com.example.userservice.controller;


import com.example.userservice.fein.ProductClient;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/users")
public class UserProductController {

    private final ProductClient productClient;

    @GetMapping("/products")
    public String getProducts() {
        return productClient.getProducts();
    }
}