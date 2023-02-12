package com.quest.bloodbankspring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.quest.bloodbankspring.models.Seeker;

public interface SeekerRepository extends JpaRepository<Seeker, Integer>{

	public Seeker findByEmail(String email); 
}
