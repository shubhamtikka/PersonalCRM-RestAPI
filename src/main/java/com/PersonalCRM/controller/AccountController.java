package com.PersonalCRM.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.PersonalCRM.dto.LoginDto;
import com.PersonalCRM.model.User;

@RestController
@RequestMapping(path = "account")
public class AccountController {
	
	@PostMapping("/v1/login")
	public boolean login(@RequestBody LoginDto logindto) {
		if(logindto.getUserId() == 1 && logindto.getPassword() == 1) {
			return true;
		} else {
			return false;
		}
	}
	
	@PostMapping("/v1/register")
	public boolean register(@RequestBody User user) {
		return true; 
	}
	
	@GetMapping("/")
	public String sayHello() {
		return "Hello world";
	}
}
