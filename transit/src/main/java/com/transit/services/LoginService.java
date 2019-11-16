package com.transit.services;

import javax.persistence.NoResultException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import com.transit.entity.LoginRequest;
import com.transit.entity.UserEntity;
import com.transit.repository.UserRepository;

@Service
public class LoginService {
	
	@Autowired
	private UserRepository userRepository;
	public LoginService() {
		
	}
	
	
	public UserEntity login(LoginRequest request) {
		try {
		return userRepository.findByUsernameAndPassword(request.getUsername(), request.getPassword());
		} catch (NoResultException e) {
			throw new ResponseStatusException(HttpStatus.NOT_FOUND, "User not found.");
		}
	}
}
