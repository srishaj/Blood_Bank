package com.quest.bloodbankspring.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.quest.bloodbankspring.models.Donor;

public interface DonorRepository extends JpaRepository<Donor, Integer> {
	
	public Donor findByEmail(String email);
	
//	List<Donor> findByDonorBloodType(String bloodType);
}
