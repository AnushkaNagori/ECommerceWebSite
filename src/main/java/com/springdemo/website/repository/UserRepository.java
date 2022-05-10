package com.springdemo.website.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springdemo.website.model.User;

public interface UserRepository extends JpaRepository<User, Integer> {

	Optional<User> findUserByEmail(String email);
	
}
