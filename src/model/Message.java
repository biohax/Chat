package model;

import java.sql.Timestamp;

public class Message {

	private String content;
	private Client sender;
	private Timestamp time;
	
	public Message(String content, Client sender){
		this.content = content;
		this.sender = sender;
		time = new Timestamp(System.currentTimeMillis());
	}
	
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public Client getSender() {
		return sender;
	}
	public void setSender(Client sender) {
		this.sender = sender;
	}
	public Timestamp getTime() {
		return time;
	}
	public void setTime(Timestamp time) {
		this.time = time;
	}
	
}
