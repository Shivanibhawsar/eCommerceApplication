package com.example.demo.repository;

import com.example.demo.model.orders.Cart;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CartRepository extends MongoRepository<Cart,Integer> {

}