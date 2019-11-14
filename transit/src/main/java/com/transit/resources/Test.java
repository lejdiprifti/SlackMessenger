package com.transit.resources;

import java.io.IOException;

import org.apache.http.HttpEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
			testService.sendRequest(model.getCustomer(), model.getId());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	
}
