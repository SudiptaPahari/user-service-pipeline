package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class userService {
	@Autowired
	UserRepository repository;
	void saveUser(Users user) {
		repository.save(user);
		System.out.println("User created :"+user.getName());
	}
}
