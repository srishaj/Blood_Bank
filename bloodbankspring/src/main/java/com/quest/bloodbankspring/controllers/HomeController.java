package com.quest.bloodbankspring.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.quest.bloodbankspring.models.Users;
import com.quest.bloodbankspring.services.UserService;

import jakarta.servlet.http.HttpSession;


@Controller
public class HomeController {
	
	@Autowired
	private UserService userService;
	
	
	@GetMapping("/")
	public String showIndexPage() {
			
		return "/HTML/Home";
		
	}
	
	
	@GetMapping("login")
	public String showLoginPage() {
		
		return "/HTML/login";
		
	}
	
	@GetMapping("/Register")
	public String showRegisterPage() {
		
		return "/HTML/Register";
	}
	
	
	@GetMapping("/adminlogin")
	public String showAdminLoginPage() {
		
		return "/HTML/adminlogin";
		
	}
	
	@GetMapping("/popup")
	public String showPopupPage() {
		
		return "/HTML/popup";
		
	}
	
	@GetMapping("/Home")
	public String showHomePage() {
		
		return "/HTML/Home";
	}
	
	@GetMapping("/Home-login")
	public String showHomeloginPage() {
		
		return "/HTML/Home-login";
	}
	
	@GetMapping("/aboutus")
	public String showAboutUsPage() {
		
		return "/HTML/aboutus";
	}
	
	@GetMapping("/contact")
	public String showContactPage() {
		
		return "/HTML/Contact";
	}
	
	@GetMapping("/donateblood")
	public String showDonatePage() {
		
		return "/HTML/donateblood";
	}
	
	@GetMapping("/edituser")
	public String showEditPage(HttpSession httpSession, Model model) {
		
		Users user = userService.findById((Integer)httpSession.getAttribute("id"));
		model.addAttribute("user", user);
		
		return "/HTML/edituser";
	}
	
	@PostMapping("/edituser")
	public String saveUser(@ModelAttribute Users user, HttpSession session) {
		
		userService.saveMyUsers(user);
		
		session.setAttribute("name", user.getFirstname());
		
		return "redirect:/Home-login";
	}
	

	
	@GetMapping("/logout")
	public String logout(HttpSession session) {
		
		session.invalidate();
		
		return "redirect:/login";
		
	}

}
