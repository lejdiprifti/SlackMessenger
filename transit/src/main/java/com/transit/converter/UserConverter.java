package com.transit.converter;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.transit.entity.UserEntity;
import com.transit.model.UserModel;

@Component
public class UserConverter {
	
	@Autowired
	private ModelMapper modelMapper;
	
	public UserConverter() {
		
	}
	
	public UserModel toModel (UserEntity entity) {
		return modelMapper.map(entity, UserModel.class);
	}
	
	public UserEntity toEntity (UserModel model) {
		return modelMapper.map(model, UserEntity.class);
	}
}
