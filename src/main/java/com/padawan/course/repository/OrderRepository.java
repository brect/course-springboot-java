package com.padawan.course.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.padawan.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{	
	
}
