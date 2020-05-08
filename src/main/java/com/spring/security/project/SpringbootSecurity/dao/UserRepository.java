package com.spring.security.project.SpringbootSecurity.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.security.project.SpringbootSecurity.entity.Users;

public interface UserRepository extends JpaRepository<Users, Long> {
	Users findByUsername(String username);
}
