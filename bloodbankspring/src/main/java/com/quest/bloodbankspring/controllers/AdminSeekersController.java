package com.quest.bloodbankspring.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.quest.bloodbankspring.models.Seeker;
import com.quest.bloodbankspring.services.AdminSeekerService;

@Controller
public class AdminSeekersController {
		
		@Autowired
		private AdminSeekerService adminseekerService;

		public AdminSeekersController(AdminSeekerService adminseekerService) {
			super();
			this.adminseekerService = adminseekerService;
		}
		
		// handler method to handle list seekers and return mode and view
		@GetMapping("/admin/seekers")
		public String listSeekers(Model model) {
			System.out.println(adminseekerService.getAllSeekers());
			List<Seeker> use = adminseekerService.getAllSeekers();
			model.addAttribute("seekers", use);
			return "/HTML/seekers";
		}
		
		
		@GetMapping("/admin/seekers/new")
		public String createSeekerForm(Model model) {
			
			
			Seeker seeker = new Seeker();
			model.addAttribute("seeker", seeker);
			return "create_seeker";
			
		}
		
		@PostMapping("/admin/seekers")
		public String saveSeeker(@ModelAttribute("seeker") Seeker seeker) {
			adminseekerService.saveSeeker(seeker);
			return "redirect:/admin/seekers";
		}
		
		@GetMapping("/admin/seekers/edit/{id}")
		public String editSeekerForm(@PathVariable int id, Model model) {
			model.addAttribute("seeker", adminseekerService.getSeekerById(id));
			return "edit_seeker";
		}

		@PostMapping("/admin/seekers/{id}")
		public String updateSeeker(@PathVariable int id,
				@ModelAttribute("seeker") Seeker seeker,
				Model model) {
			
			// get seeker from database by id
			Seeker existingSeeker = adminseekerService.getSeekerById(id);
			existingSeeker.setId(id);
			existingSeeker.setUsername(seeker.getUsername());
			existingSeeker.setFirstname(seeker.getFirstname());
			existingSeeker.setLastname(seeker.getLastname());
			existingSeeker.setPhone(seeker.getPhone());
			existingSeeker.setEmail(seeker.getEmail());
			existingSeeker.setBloodtype(seeker.getBloodtype());
			existingSeeker.setAge(seeker.getAge());
			existingSeeker.setGender(seeker.getGender());
			existingSeeker.setWeight(seeker.getWeight());
			existingSeeker.setCity(seeker.getCity());
			existingSeeker.setAddress(seeker.getAddress());
			
			
			
			// save updated seeker object
			adminseekerService.updateSeeker(existingSeeker);
			return "redirect:/admin/seekers";		
		}
		
		// handler method to handle delete seeker request
		
		@GetMapping("/admin/seekers/{id}")
		public String deleteSeeker(@PathVariable int id) {
			adminseekerService.deleteSeekerById(id);
			return "redirect:/admin/seekers";
		}
		

}