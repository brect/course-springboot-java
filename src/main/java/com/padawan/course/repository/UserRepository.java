package com.padawan.course.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.padawan.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{	
	
}
