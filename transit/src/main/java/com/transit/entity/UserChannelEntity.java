package com.transit.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class UserChannelEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Long id;
	
	@ManyToOne
	@JoinColumn(name="user_id")
	private UserEntity user;
	
	private String channelId;
	
	private boolean flag;
	
	
	
	public UserChannelEntity() {
		
	}



	public Long getId() {
		return id;
	}



	public void setId(Long id) {
		this.id = id;
	}



	public UserEntity getUser() {
		return user;
	}



	public void setUser(UserEntity user) {
		this.user = user;
	}



	public String getChannelId() {
		return channelId;
	}



	public void setChannelId(String channelId) {
		this.channelId = channelId;
	}



	public boolean isFlag() {
		return flag;
	}



	public void setFlag(boolean flag) {
		this.flag = flag;
	}
	
	
}
