package com.diego.spring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.diego.spring.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {
	
}
