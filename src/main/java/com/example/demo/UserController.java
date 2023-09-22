package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
	@Autowired
	userService UserService;
	
	@PostMapping
	void saveUser(@RequestBody Users user) {
		UserService.saveUser(user);
		System.out.println("User Created :"+user.getName());
	}

	@GetMapping
	void getUser() {
		System.out.println("Get User");
		System.out.println("devtools");

	}

}
