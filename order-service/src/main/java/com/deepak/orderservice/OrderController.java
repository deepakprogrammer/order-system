package com.deepak.orderservice;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController 
public class OrderController {
    
    public record Order(String product, Integer quantity) {}

    private final List<Order> orders = new ArrayList<>();
    
    @PostMapping("/orders")
    public Order create(@RequestBody Order order){
        orders.add(order);
        return order;
    }

    @GetMapping("/orders")
    public List<Order> getAll(){
        return orders;
    }
}
