
package com.example.userservice.controller;

import com.example.userservice.grpc.ProductGrpcClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users/grpc")
public class ProductGrpcController {

    private final ProductGrpcClient productGrpcClient;

    public ProductGrpcController(ProductGrpcClient productGrpcClient) {
        this.productGrpcClient = productGrpcClient;
    }

    @GetMapping("/products")
    public String getProducts() {
        return productGrpcClient.getProducts();
    }
}
