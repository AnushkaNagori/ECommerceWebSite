package com.springdemo.website.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springdemo.website.model.Role;

public interface RoleRepository extends JpaRepository<Role, Integer> {

}
