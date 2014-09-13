package com.acordier.patterns;

public class AckMessage extends AbstractMessageDecorator {

	public AckMessage(Message message) {
		super(message);
		
	}
	
	@Override
	public void compose(){
		/* compose message adding ACK logic */
		this.message.compose();
		System.out.printf("%s decorator is adding aknowledgement logic\n", this.getClass().getSimpleName());
	}
	
}
