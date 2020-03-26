package com.projectSpring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projectSpring.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

}
