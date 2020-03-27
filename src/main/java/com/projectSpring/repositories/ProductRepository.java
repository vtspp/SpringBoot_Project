package com.projectSpring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projectSpring.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

}
