package in.design.pattern.creational.factory;


import in.design.pattern.creational.factory.message.Message;
import in.design.pattern.creational.factory.message.TextMessage;

/**
 * Provides implementation for creating Text messages
 */
public class TextMessageCreator extends MessageCreator {

	@Override
	public Message createMessage() {
		return new TextMessage();
	}



}
