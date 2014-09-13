package com.acordier.patterns;

/**
 * Define a MessageDecarator to be extended
 * @author acordier
 *
 */
public class AbstractMessageDecorator implements Message {
	
	protected Message message;
	/**
	 * Provide a message at runtime to extend its behavior
	 * @param message
	 */
	public AbstractMessageDecorator(Message message){
		this.message = message;
	}
	
	@Override
	public void compose() {
		this.message.compose(); /* This decorator does nothing */

	}

}
