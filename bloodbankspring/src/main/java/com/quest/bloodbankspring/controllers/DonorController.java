package com.quest.bloodbankspring.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.quest.bloodbankspring.models.Donor;
import com.quest.bloodbankspring.repositories.UserRepository;
import com.quest.bloodbankspring.services.DonorService;
import com.quest.bloodbankspring.services.MailSentService;

@Controller
public class DonorController {
	
	@Autowired
	private UserRepository userRepo;
	
	@Autowired
	private MailSentService mail;
	
	@Autowired
	private DonorService donorService;
	
	@GetMapping("/Donatemsg")
	public String showDonatemsgPage() {
		
		return "/HTML/Donatemsg";
		
	}
	
	@PostMapping("/donate") // it should be postMapping
	public String sendThankYou(@ModelAttribute Donor donor) {
		
		donorService.saveMyDonor(donor);
		
		String msg = "Dear " + donor.getFirstname() + " " + donor.getLastname() + ","
				+ " \n Thank You for Donating your Blood of type " + donor.getBloodtype() +
				"\n\n Thanks and Regards,\n Blood Bank Management System" ;
		
		mail.sendSimpleMail(msg, donor.getEmail());
			
		return "redirect:/Donatemsg";
		
	}

}
