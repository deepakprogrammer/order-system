package com.deepak.orderservice.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "orders")
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private String product;
    private Integer quantity;

    protected Order(){}

    public Order(String product, Integer quanity){
        this.product = product;
        this.quantity = quanity;
    }

    public Long getId() { return id; }
    public String getProduct() { return  product; }
    public Integer getQuantity() { return quantity; }

}
