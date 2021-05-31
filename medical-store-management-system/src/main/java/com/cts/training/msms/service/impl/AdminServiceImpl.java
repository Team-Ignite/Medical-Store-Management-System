package com.cts.training.msms.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cts.training.msms.entity.Admin;
import com.cts.training.msms.repository.AdminRepository;
import com.cts.training.msms.service.AdminService;

@Service
public class AdminServiceImpl implements AdminService {
	
	@Autowired
	private AdminRepository adminRepository;
	
	@Override
	public List<Admin> getAdminDetails() {
		return adminRepository.findAll();		
		
	}

	@Override
	public Admin getAdminByUsernameAndPassword(Admin admin) {
		return adminRepository.findByUsernameAndPassword(admin.getUsername(), admin.getPassword());
		
	}

}
