
package com.example.product_service.grpc;

import com.example.product.grpc.EmptyRequest;
import com.example.product.grpc.ProductResponse;
import com.example.product.grpc.ProductServiceGrpc;

import io.grpc.stub.StreamObserver;
import org.springframework.grpc.server.service.GrpcService;

@GrpcService
public class ProductGrpcService
        extends ProductServiceGrpc.ProductServiceImplBase {

    @Override
    public void getProducts(
            EmptyRequest request,
            StreamObserver<ProductResponse> responseObserver
    ) {

        ProductResponse response = ProductResponse.newBuilder()
                .setProducts("Laptop, Phone, Keyboard")
                .build();

        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }
}
