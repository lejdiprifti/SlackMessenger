package com.transit.model;

public class MessageModel {
	public MessageModel() {
		
	}
	
	private String text;

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	@Override
	public String toString() {
		return "MessageModel [text=" + text + "]";
	}
	
	
}
