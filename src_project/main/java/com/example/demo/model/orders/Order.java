package com.example.demo.model.orders;

import lombok.Data;

import java.util.List;

public @Data class Order {

    private Integer orderId;
    private Integer userId;

    private Double totalPrice;

    private List<OrderItem> orderItems;



}
