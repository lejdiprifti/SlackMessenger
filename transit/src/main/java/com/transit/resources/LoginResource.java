package com.transit.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.transit.entity.LoginRequest;
import com.transit.model.LoginResponse;
import com.transit.services.LoginService;

@RestController
@RequestMapping(path="/login", consumes="application/json", produces="application/json")
@CrossOrigin("*")
public class LoginResource {
	
	@Autowired
	private LoginService loginService;
	public LoginResource() {
		
	}
	
	@PostMapping
	public ResponseEntity<LoginResponse> login(@RequestBody LoginRequest request) {
		return new ResponseEntity<LoginResponse>(loginService.login(request), HttpStatus.OK);
	}
}
