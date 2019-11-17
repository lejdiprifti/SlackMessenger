package com.transit.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.transit.demo.BaseResource;
import com.transit.model.UserChannelModel;
import com.transit.services.UserChannelService;

@RestController
@RequestMapping(path="/channels", consumes="application/json", produces="application/json")
public class UserChannelResource extends BaseResource{
	
	@Autowired
	private UserChannelService userChannelService;
	
	public UserChannelResource() {
		
	}
	
	@GetMapping
	public List<UserChannelModel> getAll(@RequestHeader("Authorization") String authHeader) {
		return userChannelService.getUserChannels(getUsernameFromToken(authHeader));
	}
	
	@PostMapping
	public void save(@RequestBody UserChannelModel model,@RequestHeader("Authorization") String authHeader) {
		userChannelService.saveChannels(model,getUsernameFromToken(authHeader));
	}
}
