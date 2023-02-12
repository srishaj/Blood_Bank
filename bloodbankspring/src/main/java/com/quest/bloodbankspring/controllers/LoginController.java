package com.quest.bloodbankspring.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.quest.bloodbankspring.models.Admin;
import com.quest.bloodbankspring.models.Users;
import com.quest.bloodbankspring.services.AdminService;
import com.quest.bloodbankspring.services.UserService;

import jakarta.annotation.Resource;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;

@Controller
public class LoginController {

	@Autowired
	private UserService userService;

	@Resource
	private AdminService adminService;
	
	@GetMapping("/users")
	public String showAdminHome()
	{
		return "/HTML/users";
	}
	

	@PostMapping("/login")
	public String login(@RequestParam("username") String username, @RequestParam("password") String password,
			HttpServletRequest request) {
		Users users = userService.findByUsername(username);
		Admin admin = adminService.findByUsername(username);

		if (users != null && users.getPassword().equals(password)) {
			HttpSession session = request.getSession();
			session.setAttribute("name", users.getFirstname());
			session.setAttribute("id", users.getId());
			session.setAttribute("role", "user");
			return "redirect:/Home-login";
		} else if (admin != null && admin.getPassword().equals(password)) {
			HttpSession session = request.getSession();
			session.setAttribute("id", admin.getId());
			session.setAttribute("role", "admin");
			return "redirect:admin/users";
		} else {
			return "/HTML/poperror";
		}
	}
	
	@GetMapping("/passwordRequestPopup")
	public String sendMailPassword() {
	
		return "/HTML/passwordRequestPopup";
		
	}

}
