package com.quest.bloodbankspring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.quest.bloodbankspring.models.Admin;


public interface AdminRepository extends JpaRepository<Admin, Integer> {

	public Admin findByUsername(String username);
}
