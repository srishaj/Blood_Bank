package com.quest.bloodbankspring.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.quest.bloodbankspring.models.Users;
import com.quest.bloodbankspring.services.MailSentService;
import com.quest.bloodbankspring.services.UserService;

@Controller
public class MailController {
	
	@Autowired
	private MailSentService mail;
	
	@Autowired
	private UserService userService;
	
	@GetMapping("/forgotPassword")
	public String forgotPassword() {
		
		return "redirect:/login";
	}
	
	@PostMapping("/forgotPassword")
	public String sendPassword(@RequestParam String email) {
		Users users = userService.findByEmail(email);
		System.out.println(users);
		String msg = "Dear " + users.getFirstname() + " " + users.getLastname() + " ," + "\nYour Username : "+users.getUsername() 
				+ "\nand Password : " + users.getPassword();
		
		mail.sendSimpleMail(msg, email);
			
		return "redirect:/login";
	}

}
