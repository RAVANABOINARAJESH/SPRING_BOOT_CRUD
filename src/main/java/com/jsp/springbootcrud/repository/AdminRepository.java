package com.jsp.springbootcrud.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jsp.springbootcrud.dto.Admin;

public interface AdminRepository extends JpaRepository<Admin, Integer> {
	
}
