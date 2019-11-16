package com.transit.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.transit.model.UserChannelModel;
import com.transit.services.UserChannelService;

@RestController
@RequestMapping(path="/channels", consumes="application/json", produces="application/json")
public class UserChannelResource {
	
	@Autowired
	private UserChannelService userChannelService;
	
	public UserChannelResource() {
		
	}
	
	@GetMapping("/{id}")
	public List<UserChannelModel> getAll(@PathVariable("id") Long id) {
		return userChannelService.getUserChannels(id);
	}
	
	@PostMapping
	public void save(@RequestBody UserChannelModel model) {
		userChannelService.saveChannels(model);
	}
}
