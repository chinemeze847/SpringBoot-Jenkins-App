package com.dufuna.springbootapijenkinsapp.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class UserController {

	@GetMapping("/")
	public ResponseEntity<String> getAllUsers()
	{
		return ResponseEntity.ok("You are logged in");
	}
}