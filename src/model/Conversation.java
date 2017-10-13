package model;

import java.util.List;

public class Conversation {

	private List<Client> members;
	private List<Message> messageList;
	
	
	
	public List<Client> getMembers() {
		return members;
	}
	public void setMembers(List<Client> members) {
		this.members = members;
	}
	public List<Message> getMessageList() {
		return messageList;
	}
	public void setMessageList(List<Message> messageList) {
		this.messageList = messageList;
	}
	
	
}
