package com.diego.spring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.diego.spring.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
	
}
