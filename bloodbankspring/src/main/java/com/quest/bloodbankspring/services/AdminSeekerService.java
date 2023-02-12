package com.quest.bloodbankspring.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.quest.bloodbankspring.models.Seeker;
import com.quest.bloodbankspring.repositories.SeekerRepository;

@Service
public class AdminSeekerService{

@Autowired
private SeekerRepository seekerRepository;


	public AdminSeekerService(SeekerRepository seekerRepository) {
		
		this.seekerRepository = seekerRepository;
	}

	
	public List<Seeker> getAllSeekers() {
		return seekerRepository.findAll();
	}

	
	public Seeker saveSeeker(Seeker seeker) {
		return seekerRepository.save(seeker);
	}

	
	public Seeker getSeekerById(int id) {
		return seekerRepository.findById(id).get();
	}

	
	public Seeker updateSeeker(Seeker seeker) {
		return seekerRepository.save(seeker);
	}

	
	public void deleteSeekerById(int id) {
		seekerRepository.deleteById(id);	
	}


}