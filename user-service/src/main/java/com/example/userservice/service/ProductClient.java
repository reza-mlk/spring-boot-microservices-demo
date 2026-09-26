package com.example.userservice.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClient;

@Service
@RequiredArgsConstructor
public class ProductClient {

    private final RestClient restClient;

    public String getProducts(){

        return restClient.get()
                .uri("http://product-service:8080/products")
                .retrieve()
                .body(String.class);
    }
}
