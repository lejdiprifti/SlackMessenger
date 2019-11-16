package com.transit.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.transit.model.UserModel;
import com.transit.services.UserService;

@RestController
@RequestMapping(path="/register", consumes="application/json", produces="application/json")
public class UserResource {
	
	@Autowired
	private UserService userService;
	public UserResource() {
		
	}
	
	@PostMapping
	public void register(@RequestBody UserModel model) {
		userService.register(model);
	}
	
}
