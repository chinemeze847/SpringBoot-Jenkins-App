package com.dufuna.springbootapijenkinsapp.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1")
public class UserController {

	@GetMapping("/")
	public ResponseEntity<String> getAllUsers()
	{
		return ResponseEntity.ok("I am making a change !!!!");
	}
	@GetMapping("/health-check")
	public ResponseEntity<String> checkHealth()
	{
		return ResponseEntity.ok("I am healthy !!!!");
	}
}
