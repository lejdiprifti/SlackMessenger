package com.transit.model;

public class UserChannelModel {
	private Long id;
	private UserModel user;
	private String channelId;
	private boolean flag;
	
	public UserChannelModel() {
		
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public UserModel getUser() {
		return user;
	}

	public void setUser(UserModel user) {
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

	@Override
	public String toString() {
		return "UserChannelModel [id=" + id + ", user=" + user + ", channelId=" + channelId + ", flag=" + flag + "]";
	}
	
}
