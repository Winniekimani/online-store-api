package com.example.orderservice.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.orderservice.model.GenericResponse;
import com.example.orderservice.model.OrderRequest;
import com.example.orderservice.service.OrderService;


@RequestMapping("api/orders")
@RestController
public class OrderController {
    private final OrderService orderService;

    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }

    @PostMapping("placeOrder")
    public GenericResponse<?> placeOrder(@RequestBody OrderRequest orderRequest) {
        orderService.placeOrder(orderRequest);
        GenericResponse<?> resp = GenericResponse.builder()
                .success(true)
                .msg("Order placed successfully")
                .build();
        return resp;
    }

}
