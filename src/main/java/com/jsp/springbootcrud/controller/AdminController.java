package com.jsp.springbootcrud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.jsp.springbootcrud.dto.Admin;
import com.jsp.springbootcrud.service.AdminService;

@RestController
public class AdminController {
	@Autowired
	AdminService adminService;
	
	@PostMapping("/saveadmin")
	public Admin save( @RequestBody Admin admin) {
		 return adminService.save(admin);
	}
	@GetMapping("/getalladmin")
	public List<Admin> getAllAdmin(){
		return adminService.getAllAdmin();
	}
	@GetMapping("/getadminbyid/{id}")
	public Admin getAdminById( @PathVariable int id) {
		return adminService.getAdminById(id);
	}
	
	@PutMapping("/updateadmin")
	public Admin updateAdmin(@RequestBody Admin admin) {
		return adminService.updateAdmin(admin);
	}
	@DeleteMapping("/deleteadmin/{id}")
	public Admin deleteAdmin(@PathVariable int id) {
		return adminService.delAdmin(id);
	}
	
	
	

}
