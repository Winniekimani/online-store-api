package com.example.orderservice.service.impl;

import java.time.Instant;
import java.util.UUID;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import com.example.orderservice.entity.Order;
import com.example.orderservice.entity.OrderItem;
import com.example.orderservice.model.OrderItemRequest;
import com.example.orderservice.model.OrderRequest;
import com.example.orderservice.repository.OrderRepository;
import com.example.orderservice.service.OrderService;

@Service
public class OrderServiceImpl implements OrderService{

    private final OrderRepository orderRepository;

    public OrderServiceImpl(OrderRepository orderRepository){
        this.orderRepository=orderRepository;
    }

    @Override
    public void placeOrder(OrderRequest orderRequest) {
       Order order = new Order();
       order.setOrderNumber(UUID.randomUUID().toString());
       order.setOrderTime(Instant.now());
       var orderItems = orderRequest.getOrderItems().stream().map(this::mapToOrderItemEntity).toList();
       order.setOrderItems(orderItems);
       orderRepository.save(order);
    }
    private OrderItem mapToOrderItemEntity(OrderItemRequest itemRequest){
        OrderItem orderItem = new OrderItem();
        BeanUtils.copyProperties(itemRequest, orderItem);
        return orderItem;
    }

}