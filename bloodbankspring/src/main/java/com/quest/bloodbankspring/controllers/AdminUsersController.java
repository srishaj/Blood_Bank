package com.quest.bloodbankspring.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.quest.bloodbankspring.models.Users;
import com.quest.bloodbankspring.services.AdminUserService;
import com.quest.bloodbankspring.services.UserService;

@Controller
public class AdminUsersController {
		
		@Autowired
		private AdminUserService adminuserService;
		@Autowired
		private UserService userService;

		public AdminUsersController(AdminUserService adminuserService) {
			super();
			this.adminuserService = adminuserService;
		}
		
		// handler method to handle list users and return mode and view
		@GetMapping("/admin/users")
		public String listUsers(Model model) {
			System.out.println(adminuserService.getAllUsers());
			List<Users> use = adminuserService.getAllUsers();
			model.addAttribute("users", use);
			return "/HTML/users";
		}
		
		
		@GetMapping("/admin/users/new")
		public String createUserForm(Model model) {
			
			
			
			return "create_user";
			
		}
		
		@PostMapping("/admin/users")
		public String saveUser(@ModelAttribute("user") Users user) {
			adminuserService.saveUser(user);
			return "redirect:/admin/users";
		}
		
		@GetMapping("/admin/user/edit/{id}")
		public String editUserForm(@PathVariable Integer id, Model model) {
//			Users user =null;
//			
//			Optional<Users> optionaluser=adminuserService.findbyid(id);
//			
//			model.addAttribute("user", user);
			System.out.println("inside Get mapping");
			Users user = userService.findById(id);
			model.addAttribute("user", user);
			System.out.println("inside gm before return");
			return "/HTML/edit_user";
		}

		@PostMapping("/admin/update/user")
		public String updateUser(@ModelAttribute Users user) {
			System.out.println("inside Post mapping");
			// get user from database by id
//		Users existingUser = adminuserService.getUserById(id);
//			existingUser.setId(id);
//			existingUser.setFirstname(user.getFirstname());
//			existingUser.setLastname(user.getLastname());
//			existingUser.setContact(user.getContact());
//			existingUser.setEmail(user.getEmail());
//			existingUser.setUsername(user.getUsername());
//			existingUser.setPassword(user.getPassword());
			System.out.println(user.getUsername());
			// save updated user object
			adminuserService.saveUser(user);
//			adminuserService.updateUser(user);
			System.out.println("inside pm before return");
			return "redirect:/admin/users";		
		}
		
		// handler method to handle delete user request
		
		@GetMapping("/admin/users/{id}")
		public String deleteUser(@PathVariable int id) {
			adminuserService.deleteUserById(id);
			return "redirect:/admin/users";
		}

}