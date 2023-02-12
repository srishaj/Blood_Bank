package com.quest.bloodbankspring.repositories;


import org.springframework.data.jpa.repository.JpaRepository;

import com.quest.bloodbankspring.models.Users;

public interface UserRepository extends JpaRepository<Users, Integer> {
	
	//@Query(value = "SELECT * FROM users_tb WHERE username =:username", nativeQuery = true)
	public Users findByUsername(String username);
	
	public Users findByEmail(String email);
	
	
}
