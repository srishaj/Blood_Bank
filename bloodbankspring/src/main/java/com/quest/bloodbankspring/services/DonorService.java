package com.quest.bloodbankspring.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.quest.bloodbankspring.models.Donor;
import com.quest.bloodbankspring.repositories.DonorRepository;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class DonorService {
	
	@Autowired
	private DonorRepository DonorRepo;
	
	public DonorService(DonorRepository DonorRepo) {
		this.DonorRepo = DonorRepo;
	}
	
	public void saveMyDonor(Donor donor) {
		
		DonorRepo.save(donor);
	}
	
	public Donor findByEmail(String email) {

        return DonorRepo.findByEmail(email);
    }
	
//	public List<Donor> listAllByBloodType(String bloodType){
//		
//		return DonorRepo.findByDonorBloodType(bloodType);
//	}

}
