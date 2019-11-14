package com.transit.resources;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import com.transit.model.MessageModel;
import com.transit.model.OrderModel;
import com.transit.services.TestService;

@RestController
@RequestMapping(path="/testing", consumes="application/json", produces="application/json")
public class Test {
	
	@Autowired
	TestService testService;
	
	public Test() {
		
	}
	
	@PostMapping
	public void getRequests(@RequestBody OrderModel model) {
		try {
			testService.sendOrder(model.getCustomer(), model.getId());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	@PostMapping("/message")
	public ResponseEntity<String> sendMessage(@RequestBody MessageModel model) {
		try {
			return new ResponseEntity<String>(testService.sendMessageOnSlack(model), HttpStatus.CREATED);
		} catch (IOException e) {
			throw new ResponseStatusException(HttpStatus.NOT_FOUND);
		}
	}
	
}
