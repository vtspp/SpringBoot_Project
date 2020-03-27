package com.projectSpring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projectSpring.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{

}
