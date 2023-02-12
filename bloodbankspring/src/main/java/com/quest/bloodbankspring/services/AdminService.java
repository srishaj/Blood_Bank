package com.quest.bloodbankspring.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.quest.bloodbankspring.models.Admin;
import com.quest.bloodbankspring.repositories.AdminRepository;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class AdminService {
		
		@Autowired
		private AdminRepository adminRepo;
		
		public AdminService(AdminRepository adminRepo) {
			this.adminRepo = adminRepo;
		}
		
		public Admin findByUsername(String username) {

	        return adminRepo.findByUsername(username);
	    }
}
