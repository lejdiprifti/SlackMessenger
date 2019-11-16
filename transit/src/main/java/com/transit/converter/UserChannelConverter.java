package com.transit.converter;

import java.util.ArrayList;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.transit.entity.UserChannelEntity;
import com.transit.model.UserChannelModel;

@Component
public class UserChannelConverter {
	
	@Autowired
	private ModelMapper modelMapper;
	
	public UserChannelConverter () {
		
	}
	
	public UserChannelEntity toEntity(UserChannelModel model) {
		return modelMapper.map(model, UserChannelEntity.class);
	}
	
	public UserChannelModel toModel(UserChannelEntity entity) {
		return modelMapper.map(entity, UserChannelModel.class);
	}
	
	public List<UserChannelModel> toModel(List<UserChannelEntity> entityList) {
		List<UserChannelModel> modelList = new ArrayList<UserChannelModel>();
		for (UserChannelEntity entity : entityList) {
			modelList.add(toModel(entity));
		}
		return modelList;
	}
}
