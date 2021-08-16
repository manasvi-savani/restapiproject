package com.citi.training.Rest_API.repo;

import com.citi.training.Rest_API.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


public interface UserRepository extends JpaRepository<User, Integer> {
    List<User> findByName(String name);
}
