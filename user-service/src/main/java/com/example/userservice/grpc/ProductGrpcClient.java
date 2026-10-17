package com.example.userservice.grpc;

import com.example.product.grpc.EmptyRequest;
import com.example.product.grpc.ProductResponse;
import com.example.product.grpc.ProductServiceGrpc;

import org.springframework.grpc.client.GrpcChannelFactory;
import org.springframework.stereotype.Service;

@Service
public class ProductGrpcClient {

    private final ProductServiceGrpc.ProductServiceBlockingStub stub;

    public ProductGrpcClient(GrpcChannelFactory channelFactory) {

        this.stub = ProductServiceGrpc.newBlockingStub(
                channelFactory.createChannel("product")
        );
    }

    public String getProducts() {

        EmptyRequest request = EmptyRequest.newBuilder().build();

        ProductResponse response = stub.getProducts(request);

        return response.getProducts();
    }
}
