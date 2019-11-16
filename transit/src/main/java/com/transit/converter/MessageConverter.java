package com.transit.converter;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.transit.entity.DataEntity;
import com.transit.model.DataModel;

@Component
public class MessageConverter {
	
	@Autowired
	private ModelMapper modelMapper;
	
	public MessageConverter() {
		
	}
	
	public DataModel toModel(DataEntity entity) {
		return modelMapper.map(entity, DataModel.class);
	}
	
	public DataEntity toEntity(DataModel model) {
		return modelMapper.map(model, DataEntity.class);
	}
	
}
