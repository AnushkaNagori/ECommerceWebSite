package com.springdemo.website.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springdemo.website.model.Category;

public interface CategoryRepository extends JpaRepository<Category, Integer> {

}
