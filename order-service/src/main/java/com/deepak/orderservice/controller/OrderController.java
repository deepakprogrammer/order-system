package com.deepak.orderservice.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController 
public class OrderController {
    
    @PostMapping("/orders")
    public void create(){
        
    }

    @GetMapping("/orders")
    public void getAll(){
        return;
    }
}
