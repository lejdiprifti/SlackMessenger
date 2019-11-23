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

@RestController
@RequestMapping(path = "/messenger", consumes = "application/json", produces = "application/json")
@CrossOrigin("*")
public class MessageResource {

	@Autowired
	private ParseJson parseJson;

	@Autowired
	private MessageService messageService;

	public MessageResource() {

	}

	@PostMapping
	@CrossOrigin("*")
	public ResponseEntity<String> add(@RequestBody String object) {
		MyJsonObject myJson = parseJson.parse(object);
		return new ResponseEntity<String>(messageService.add(myJson), HttpStatus.CREATED);
	}
}
