package com.quest.bloodbankspring.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.quest.bloodbankspring.models.Users;
import com.quest.bloodbankspring.services.UserService;



@Controller
public class RegisterController {
	
	@Autowired
	private UserService userService;
	
	@GetMapping("/duplicatepopup")
	public String showDuplicatePopup(){
		
		return"/HTML/duplicatepopup";
	}
	
	@PostMapping("Register")
	public String saveUser(@ModelAttribute Users user, BindingResult bindingResult) {
		
		
		try {
			userService.saveMyUsers(user);
	    } catch (DataIntegrityViolationException e) {
	        bindingResult.rejectValue("email", "duplicate", "Email address already exists");
	        return "redirect:/duplicatepopup";
	    }
		
		
		return "redirect:/popup";
	}
	
	
}
