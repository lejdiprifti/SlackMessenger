package com.transit.resources;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.transit.model.MessageModel;
import com.transit.services.MessageService;
import com.transit.services.TestService;

@RestController
@RequestMapping(path="/messenger", consumes="application/json", produces="application/json")
public class MessageResource {
	
	@Autowired
	private TestService testService;
	
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
	 * @CrossOrigin("http://localhost:4000") public ResponseEntity<String>
	 * sendMessage(@RequestBody MessageModel model) { System.out.println(model); try
	 * { return new ResponseEntity<String>(testService.sendMessageOnSlack(model),
	 * HttpStatus.CREATED); } catch (IOException e) { throw new
	 * ResponseStatusException(HttpStatus.NOT_FOUND); } }
	 */
	
	@PostMapping
	@CrossOrigin("*")
	@ResponseStatus(HttpStatus.CREATED)
	public void add(@RequestBody MessageModel model) {
		System.out.println(model);
			messageService.add(model);
	}
}
