package com.acordier.patterns;

/**
 * Decorator pattern in action
 */
public class DecoratorApp 
{
    public static void main( String[] args )
    {
    	Message message = new AckMessage(new SimpleMessage("Alice", "Bob", "Eve is watching us"));
    	message.compose();
    }
}
