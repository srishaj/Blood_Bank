package com.quest.bloodbankspring.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.quest.bloodbankspring.models.Seeker;
import com.quest.bloodbankspring.repositories.SeekerRepository;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class SeekerService {
	
	@Autowired
	SeekerRepository seekerRepository;
	public List<Seeker> listAll(){
		return seekerRepository.findAll();
	}
	public Seeker save(Seeker seeker) {
		return seekerRepository.save(seeker);
	}
	public Optional<Seeker>findOne(Integer id) {
		return seekerRepository.findById(id);
	}
	public void delete(Seeker seeker) {
		seekerRepository.delete(seeker);
	}

}


