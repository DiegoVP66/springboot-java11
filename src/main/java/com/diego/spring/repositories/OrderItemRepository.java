package com.diego.spring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.diego.spring.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {
	
}
