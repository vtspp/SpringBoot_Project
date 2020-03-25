package com.projectSpring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projectSpring.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
