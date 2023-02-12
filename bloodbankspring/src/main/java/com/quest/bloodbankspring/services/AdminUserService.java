package com.quest.bloodbankspring.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.quest.bloodbankspring.models.Users;
import com.quest.bloodbankspring.repositories.UserRepository;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class AdminUserService{

@Autowired
private UserRepository userRepository;


	public AdminUserService(UserRepository userRepository) {
		
		this.userRepository = userRepository;
	}

	
	public List<Users> getAllUsers() {
		return userRepository.findAll();
	}

	
	public Users saveUser(Users user) {
		return userRepository.save(user);
	}

	
	public Users getUserById(int id) {
		return userRepository.findById(id).get();
	}

	
	public Users updateUser(Users user) {
		return userRepository.save(user);
	}

	
	public void deleteUserById(int id) {
		userRepository.deleteById(id);	
	}
	
	public Optional<Users> findbyid(Integer id) 
	{
		return userRepository.findById(id);
	}


}