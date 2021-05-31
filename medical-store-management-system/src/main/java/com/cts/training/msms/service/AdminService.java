package com.cts.training.msms.service;

import java.util.List;

import com.cts.training.msms.entity.Admin;

public interface AdminService {
	
	List<Admin> getAdminDetails();
	
	Admin getAdminByUsernameAndPassword(Admin admin);

}
