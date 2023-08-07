package com.jsp.springbootcrud.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.jsp.springbootcrud.dao.AdminDao;
import com.jsp.springbootcrud.dto.Admin;

@Service
public class AdminService {
	@Autowired
	AdminDao adminDao;

	public Admin save(Admin admin) {
		return adminDao.saveAdmin(admin);
	}

	public List<Admin> getAllAdmin() {
		return adminDao.getAllAdmin();
	}

	public Admin getAdminById(int id) {
		return adminDao.getAdminById(id);
	}

	public Admin updateAdmin(Admin admin) {
		return adminDao.updateAdmin(admin);
	}

	public Admin delAdmin(int id) {
		return adminDao.deleteAdmin(id);
	}
}
