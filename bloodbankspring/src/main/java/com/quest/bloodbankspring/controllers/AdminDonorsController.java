package com.quest.bloodbankspring.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.quest.bloodbankspring.models.Donor;
import com.quest.bloodbankspring.services.AdminDonorService;

@Controller
public class AdminDonorsController {
		
		@Autowired
		private AdminDonorService admindonorService;

		public AdminDonorsController(AdminDonorService admindonorService) {
			super();
			this.admindonorService = admindonorService;
		}
		
		// handler method to handle list donors and return mode and view
		@GetMapping("/admin/donors")
		public String listDonors(Model model) {
			System.out.println(admindonorService.getAllDonors());
			List<Donor> use = admindonorService.getAllDonors();
			model.addAttribute("donors", use);
			return "/HTML/donors";
		}
		
		
		@GetMapping("/admin/donors/new")
		public String createDonorForm(Model model) {
			
			
			Donor donor = new Donor();
			model.addAttribute("donor", donor);
			return "create_donor";
			
		}
		
		@PostMapping("/admin/donors")
		public String saveDonor(@ModelAttribute("donor") Donor donor) {
			admindonorService.saveDonor(donor);
			return "redirect:/admin/donors";
		}
		
		@GetMapping("/admin/donors/edit/{id}")
		public String editDonorForm(@PathVariable int id, Model model) {
			model.addAttribute("donor", admindonorService.getDonorById(id));
			return "edit_donor";
		}

		@PostMapping("/admin/donors/{id}")
		public String updateDonor(@PathVariable int id,
				@ModelAttribute("donor") Donor donor,
				Model model) {
			
			// get donor from database by id
			Donor existingDonor = admindonorService.getDonorById(id);
			existingDonor.setId(id);
			existingDonor.setFirstname(donor.getFirstname());
			existingDonor.setLastname(donor.getLastname());
			existingDonor.setContact(donor.getContact());
			existingDonor.setEmail(donor.getEmail());
			existingDonor.setBloodtype(donor.getBloodtype());
			existingDonor.setAge(donor.getAge());
			existingDonor.setGender(donor.getGender());
			existingDonor.setWeight(donor.getWeight());
			existingDonor.setCity(donor.getCity());
			
			
			
			// save updated donor object
			admindonorService.updateDonor(existingDonor);
			return "redirect:/admin/donors";		
		}
		
		// handler method to handle delete donor request
		
		@GetMapping("/admin/donors/{id}")
		public String deleteDonor(@PathVariable int id) {
			admindonorService.deleteDonorById(id);
			return "redirect:/admin/donors";
		}
		
		@GetMapping("/admin/donors/edit/approve/{id}")
		public String updateDonorApprove(@PathVariable int id,
				@ModelAttribute("donor") Donor donor,
				Model model) {
			
			Donor existingDonor = admindonorService.getDonorById(id);
			
			existingDonor.setId(id);
			
			existingDonor.setApprove(true);
			
			admindonorService.updateDonor(existingDonor);
			return "redirect:/admin/donors";
			
			
		}

}