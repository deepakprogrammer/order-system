package com.deepak.orderservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.deepak.orderservice.entity.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{
    
}
