package com.quest.bloodbankspring.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.quest.bloodbankspring.models.Users;
import com.quest.bloodbankspring.repositories.UserRepository;
import jakarta.transaction.Transactional;

@Service
@Transactional
public class UserService {
	
	@Autowired
	private UserRepository userRepo;
	
	public UserService(UserRepository userRepo) {
		this.userRepo = userRepo;
	}
	
	public void saveMyUsers(Users user) {
		
		userRepo.save(user);
	}
	
	public Users findByUsername(String username) {

        return userRepo.findByUsername(username);
    }
	
	public Users findByEmail(String email) {

        return userRepo.findByEmail(email);
    }
	
	public Users findById(Integer id) {
		
        return userRepo.findById(id).get();
    }

}
