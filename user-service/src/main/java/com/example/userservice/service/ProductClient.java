package com.example.userservice.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClient;

@Service
@RequiredArgsConstructor
public class ProductClient {

    private final RestClient.Builder restClientBuilder;

    public String getProducts() {

        return restClientBuilder
                .build()
                .get()
                .uri("http://PRODUCT-SERVICE/products")
                .retrieve()
                .body(String.class);
    }
}