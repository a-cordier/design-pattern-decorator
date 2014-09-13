package com.acordier.patterns;

public class SimpleMessage implements Message {
	
	private String sender;
	private String recipient;
	private String content;
	
	public SimpleMessage(String sender, String recipient, String content){
		this.sender = sender;
		this.recipient = recipient;
		this.content = content;
	}
	
	@Override
	public void compose() {
		System.out.printf("%s is composing message : {sender:%s, recipient:%s, content:%s}\n", this.getClass().getSimpleName(), this.sender, this.recipient, this.content);
	}

	public String getSender() {
		return sender;
	}

	public void setSender(String sender) {
		this.sender = sender;
	}

	public String getRecipient() {
		return recipient;
	}

	public void setRecipient(String recipient) {
		this.recipient = recipient;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}
	
	

}
