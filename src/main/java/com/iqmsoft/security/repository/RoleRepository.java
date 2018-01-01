package com.iqmsoft.security.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.iqmsoft.security.model.Role;


public interface RoleRepository extends JpaRepository<Role, Long>{
    
}
