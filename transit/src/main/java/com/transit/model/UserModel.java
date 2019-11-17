package com.transit.model;

import java.util.Date;

public class UserModel {

	private Long id;
	private String username;
	private String firstName;
	private String lastName;
	private String password;
	private Date date;
	private String slackToken;
	public UserModel() {
		
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getSlackToken() {
		return slackToken;
	}

	public void setSlackToken(String slackToken) {
		this.slackToken = slackToken;
	}

	@Override
	public String toString() {
		return "UserModel [id=" + id + ", username=" + username + ", firstName=" + firstName + ", lastName=" + lastName
				+ ", password=" + password + ", date=" + date + "]";
	}
	
}
