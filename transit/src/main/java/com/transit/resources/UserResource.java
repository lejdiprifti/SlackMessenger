package com.transit.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.transit.demo.BaseResource;
import com.transit.model.UserModel;
import com.transit.services.UserService;

@RestController
@RequestMapping(path="/users", consumes="application/json", produces="application/json")
@CrossOrigin("*")
public class UserResource extends BaseResource {
	
	@Autowired
	private UserService userService;
	public UserResource() {
		
	}
	
	@PutMapping
	@ResponseStatus(HttpStatus.OK)
	public void edit(@RequestHeader("Authorization") String authHeader, @RequestBody UserModel model) {
		userService.update(getUsernameFromToken(authHeader), model);
	}
}
