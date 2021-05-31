package com.cts.training.msms.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cts.training.msms.entity.Admin;
import com.cts.training.msms.service.AdminService;

@RestController
@RequestMapping("/msms/v1")
public class AdminController {
	
	@Autowired
	private AdminService adminService;
	
	@GetMapping("/admin")
	public List<Admin> getAllAdminDetails() {
		return adminService.getAdminDetails(); 
	}
	
	public boolean validateAdminDetails(@RequestBody Admin admin) {
		Admin admin2 = adminService.getAdminByUsernameAndPassword(admin);
		if(admin2 != null) {
			return true;
		}
		return false;
	}

}
