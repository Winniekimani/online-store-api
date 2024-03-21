package com.example.productservice.service;

import com.example.productservice.model.ProductCreateRequest;
import com.example.productservice.model.ProductCreateResponse;

import java.util.List;

public interface ProductService {
    ProductCreateResponse createProduct(ProductCreateRequest productCreateRequest);

    List<ProductCreateResponse> findAll();


    ProductCreateResponse findById(Integer productId);
}
