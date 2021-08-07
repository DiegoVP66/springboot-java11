package com.diego.spring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.diego.spring.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {
	
}
