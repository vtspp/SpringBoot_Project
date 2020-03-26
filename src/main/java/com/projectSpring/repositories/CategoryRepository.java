package com.projectSpring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projectSpring.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{

}
