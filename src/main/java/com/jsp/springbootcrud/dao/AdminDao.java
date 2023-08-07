package com.jsp.springbootcrud.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import com.jsp.springbootcrud.dto.Admin;
import com.jsp.springbootcrud.repository.AdminRepository;

@Repository
public class AdminDao {
	@Autowired
	AdminRepository adminRepository;

	public Admin saveAdmin(Admin admin) {
		return adminRepository.save(admin);

	}

	public List<Admin> getAllAdmin() {
		return adminRepository.findAll();
	}

	public Admin getAdminById(int id) {
		Optional<Admin> optional = adminRepository.findById(id);
		if (optional.isPresent()) {
			return optional.get();
		}
		return null;
	}


	public Admin updateAdmin(Admin admin) {
		Optional<Admin> optional = adminRepository.findById(admin.getId());
		if (optional.isPresent()) {
			return adminRepository.save(admin);
		}
		return null;
	}

	public Admin deleteAdmin(int id) {
		Optional<Admin> optional = adminRepository.findById(id);
		if (optional.isPresent()) {
			adminRepository.delete(optional.get());
		}
		return optional.get();
	}
}
