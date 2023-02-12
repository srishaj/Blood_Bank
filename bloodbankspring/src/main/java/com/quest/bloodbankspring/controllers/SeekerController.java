package com.quest.bloodbankspring.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.quest.bloodbankspring.models.Seeker;
import com.quest.bloodbankspring.services.DonorService;
import com.quest.bloodbankspring.services.SeekerService;

@Controller
public class SeekerController {
	
	@Autowired
	SeekerService seekerService;
	
	@Autowired
	DonorService donorService;

	
	@GetMapping("/seeker")
	public String showSeekerPage() {
		
		return "/HTML/seeker";
	}
	
//	@PostMapping("/seeker")
//	public String showFindDonor(@ModelAttribute Seeker seeker, Model model) {
//		seekerService.save(seeker);
//		List<Donor> donors=donorService.listAllByBloodType(seeker.getBloodtype());
//		model.addAttribute("donors", donors);
//		model.addAttribute("bloodType", seeker.getBloodtype());
//		return "/HTML/findDonors";
//	}

}
