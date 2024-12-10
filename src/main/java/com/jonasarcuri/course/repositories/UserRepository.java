package com.jonasarcuri.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jonasarcuri.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
	
}
