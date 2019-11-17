package com.transit.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.transit.demo.ParseJson;
import com.transit.model.MyJsonObject;
import com.transit.services.MessageService;
import com.transit.services.TestService;

@RestController
@RequestMapping(path = "/messenger", consumes = "application/json", produces = "application/json")
@CrossOrigin("*")
public class MessageResource {

	@Autowired
	private TestService testService;

	@Autowired
	private ParseJson parseJson;

	@Autowired
	private MessageService messageService;

	public MessageResource() {

	}

	/*
	 * @PostMapping public void getRequests(@RequestBody OrderModel model) { try {
	 * testService.sendOrder(model.getCustomer(), model.getId()); } catch
	 * (IOException e) { e.printStackTrace(); } }
	 */

	/*
	 * @PostMapping("/message")
	 * 
	 * @ResponseStatus(HttpStatus.CREATED) public void sendMessage(@RequestBody
	 * MyJsonObject model) { messageService.send(model); }
	 */

	@PostMapping
	@CrossOrigin("*")
	public ResponseEntity<String> add(@RequestBody String object) {
		MyJsonObject myJson = parseJson.parse(object);
		return new ResponseEntity<String>(messageService.add(myJson), HttpStatus.CREATED);
	}
}
