package com.transit.services;

import java.util.List;

import javax.persistence.NoResultException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import com.transit.converter.UserChannelConverter;
import com.transit.converter.UserConverter;
import com.transit.entity.UserChannelEntity;
import com.transit.entity.UserEntity;
import com.transit.model.UserChannelModel;
import com.transit.repository.UserChannelRepository;
import com.transit.repository.UserRepository;

@Service
public class UserChannelService {
	
	@Autowired
	private UserChannelRepository userChannelRepository;
	
	@Autowired
	private UserChannelConverter userChannelConverter;
	
	@Autowired
	private UserConverter userConverter;
	
	@Autowired
	private UserRepository userRepository;
	public UserChannelService() {
		
	}
	
	public void saveChannels(UserChannelModel model,String username) {
		UserChannelEntity entity = new UserChannelEntity();
		entity.setChannelId(model.getChannelId());
		entity.setUser(userRepository.findByUsername(username));
		entity.setFlag(true);
		userChannelRepository.save(entity);
	}
	
	public List<UserChannelModel> getUserChannels(String username) {
		try {
			UserEntity user = userRepository.findByUsername(username);
			return userChannelConverter.toModel(userChannelRepository.findAllByUser(user));
		} catch (NoResultException e) {
			throw new ResponseStatusException(HttpStatus.NOT_FOUND, "User not found");
		}
	}
	
}
