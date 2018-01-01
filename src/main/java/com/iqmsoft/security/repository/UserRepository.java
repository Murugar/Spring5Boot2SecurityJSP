package com.iqmsoft.security.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.iqmsoft.security.model.User;


public interface UserRepository extends JpaRepository<User, Long>{
    
    User findByUsername(String username);
}
