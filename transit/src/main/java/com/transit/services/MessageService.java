package com.transit.services;

import java.io.IOException;
import java.util.List;

import org.apache.http.client.ClientProtocolException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import com.transit.entity.DataEntity;
import com.transit.entity.UserChannelEntity;
import com.transit.model.MyJsonObject;
import com.transit.repository.MessageRepository;
import com.transit.repository.UserChannelRepository;

@Service
public class MessageService {
	
	@Autowired
	private MessageRepository repository;
	
	@Autowired
	private UserChannelRepository userChannelRepository;
	
	@Autowired 
	private TestService test;
	public MessageService() {
		
	}
	
	public String add(MyJsonObject model) {
		
		DataEntity entity = new DataEntity();
		entity.setEmerKlienti(model.getEmerKlienti());
		repository.save(entity);
		return send(model);
	}
	
	public String send(MyJsonObject model) {
		List<UserChannelEntity> list = userChannelRepository.findAllByFlag(true);
		for (UserChannelEntity userChannel: list) {
			try {
				test.sendMessageOnSlack(model, userChannel.getChannelId(), userChannel.getUser().getSlackToken());
			} catch (ClientProtocolException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				throw new ResponseStatusException(HttpStatus.BAD_REQUEST);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				throw new ResponseStatusException(HttpStatus.BAD_REQUEST);
			}
		}
		return "RETURNED";
	}
	
}
