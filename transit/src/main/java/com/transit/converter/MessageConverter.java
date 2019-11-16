package com.transit.converter;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.transit.entity.MessageEntity;
import com.transit.model.MessageModel;

@Component
public class MessageConverter {
	
	@Autowired
	private ModelMapper modelMapper;
	
	public MessageConverter() {
		
	}
	
	public MessageModel toModel(MessageEntity entity) {
		return modelMapper.map(entity, MessageModel.class);
	}
	
	public MessageEntity toEntity(MessageModel model) {
		return modelMapper.map(model, MessageEntity.class);
	}
	
}
