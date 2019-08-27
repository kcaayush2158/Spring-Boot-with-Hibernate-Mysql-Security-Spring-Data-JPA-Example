package com.application.security.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.application.security.model.Role;

public interface RoleRepository extends JpaRepository<Role,Integer> {

}
