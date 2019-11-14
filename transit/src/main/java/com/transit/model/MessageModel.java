package com.transit.model;

public class MessageModel {
	public MessageModel() {
		
	}
	
	private String username;
	private String app;
	

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getApp() {
		return app;
	}

	public void setApp(String app) {
		this.app = app;
	}

	@Override
	public String toString() {
		return "MessageModel [username=" + username + ", app=" + app + "]";
	}

	
	
}
