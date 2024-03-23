package com.example.orderservice.service;

import com.example.orderservice.model.OrderRequest;

public interface OrderService {

    void placeOrder(OrderRequest orderRequest);

}
