package com.transit.services;

import java.util.GregorianCalendar;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.transit.entity.UserEntity;
import com.transit.model.UserModel;
import com.transit.repository.UserRepository;

@Service
public class UserService {
	
	@Autowired
	private UserRepository userRepository;
	public UserService() {
		
	}
	
	public void register(UserModel model) {
		UserEntity entity = new UserEntity();
		entity.setUsername(model.getUsername());
		entity.setFirstName(model.getFirstName());
		entity.setLastName(model.getLastName());
		entity.setPassword(model.getPassword());
		entity.setDate(new GregorianCalendar().getTime());
		userRepository.save(entity);
	}
}
