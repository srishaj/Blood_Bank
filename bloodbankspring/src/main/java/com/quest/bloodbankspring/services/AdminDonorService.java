package com.quest.bloodbankspring.services;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.quest.bloodbankspring.models.Donor;
import com.quest.bloodbankspring.repositories.DonorRepository;

@Service
public class AdminDonorService{

@Autowired
private DonorRepository donorRepository;


	public AdminDonorService(DonorRepository donorRepository) {
		
		this.donorRepository = donorRepository;
	}

	
	public List<Donor> getAllDonors() {
		return donorRepository.findAll();
	}

	
	public Donor saveDonor(Donor donor) {
		return donorRepository.save(donor);
	}

	
	public Donor getDonorById(int id) {
		return donorRepository.findById(id).get();
	}

	
	public Donor updateDonor(Donor donor) {
		return donorRepository.save(donor);
	}

	
	public void deleteDonorById(int id) {
		donorRepository.deleteById(id);	
	}


}
