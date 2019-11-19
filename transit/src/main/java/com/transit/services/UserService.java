package com.transit.services;

import java.util.GregorianCalendar;

import javax.persistence.NoResultException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

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
			 if (userRepository.findByUsername(model.getUsername()) == null) {
				 UserEntity entity = new UserEntity();
					entity.setUsername(model.getUsername());
					entity.setFirstName(model.getFirstName());
					entity.setLastName(model.getLastName());
					entity.setPassword(model.getPassword());
					entity.setDate(new GregorianCalendar().getTime());
					userRepository.save(entity);
			 } else {
			throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Username already exists");
			 }			
		}

	public void update(Long id, UserModel model) {
		try {
			UserEntity user = userRepository.findById(id).get();
			if (model.getSlackToken() != null) {
				user.setSlackToken(model.getSlackToken());
			}
			userRepository.save(user);
		} catch (NoResultException e) {
			throw new ResponseStatusException(HttpStatus.NOT_FOUND, "User not found");
		}
	}
}
