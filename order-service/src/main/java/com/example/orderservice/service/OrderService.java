package com.example.orderservice.service;

import com.example.orderservice.model.OrderRequest;

public interface OrderService {

    String placeOrder(OrderRequest orderRequest);


}
