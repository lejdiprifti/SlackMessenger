package com.transit.services;

import java.io.IOException;

import org.apache.http.client.ClientProtocolException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.transit.entity.MessageEntity;
import com.transit.model.MyJsonObject;
import com.transit.repository.MessageRepository;

@Service
public class MessageService {
	
	@Autowired
	private MessageRepository repository;
	
	@Autowired 
	private TestService test;
	public MessageService() {
		
	}
	
	public void add(MyJsonObject model) {
		MessageEntity entity = new MessageEntity();
		entity.setEmerKlienti(model.getEmerKlienti());
		try {
			test.sendMessageOnSlack(model);
		} catch (ClientProtocolException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		repository.save(entity);
	}
}