package com.ws.models;

public class Message {

	private String name;
	private String content;
	private String time;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	public Message(String name, String content, String time) {
		super();
		this.name = name;
		this.content = content;
		this.time = time;
	}
	
	
}
