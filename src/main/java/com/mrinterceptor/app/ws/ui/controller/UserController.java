package com.mrinterceptor.app.ws.ui.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mrinterceptor.app.ws.ui.model.request.UserDetailsRequestModel;

@RestController
@RequestMapping("users")
public class UserController {
	
	@GetMapping
	public String getUser() {
		return "Get User was called!";
	}
	
	@PostMapping
	public String createUser(@RequestBody UserDetailsRequestModel userDetails) {
		return "Create User was called!";
	}
	
	@PutMapping
	public String updateUser() {
		return "Update User was called!";
	}
	
	@DeleteMapping
	public String deleteUser() {
		return "Delete User was called!";
	}
}
