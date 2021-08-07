package com.diego.spring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.diego.spring.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
	
}
