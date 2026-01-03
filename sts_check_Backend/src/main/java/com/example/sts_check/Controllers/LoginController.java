package com.example.sts_check.Controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class LoginController {
	@GetMapping("/login")
	public String saveLogin() {
		return "User login was success";
	}
	
	@GetMapping("/getallusers")
	public String getUsersList()
	{
		return "List of all users feched success";
	}

}
