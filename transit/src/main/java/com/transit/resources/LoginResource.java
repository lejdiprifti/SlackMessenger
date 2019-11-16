package com.transit.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.transit.entity.LoginRequest;
import com.transit.entity.UserEntity;
import com.transit.services.LoginService;

@RestController
@RequestMapping(path="/login", consumes="application/json", produces="application/json")
public class LoginResource {
	
	@Autowired
	private LoginService loginService;
	public LoginResource() {
		
	}
	
	@PostMapping
	public UserEntity login(LoginRequest request) {
		return loginService.login(request);
	}
}
