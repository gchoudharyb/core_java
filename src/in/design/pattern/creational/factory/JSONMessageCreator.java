package in.design.pattern.creational.factory;

import in.design.pattern.creational.factory.message.JSONMessage;
import in.design.pattern.creational.factory.message.Message;

/**
 * Provides implementation for creating JSON messages
 */
public class JSONMessageCreator extends MessageCreator {

	@Override
	public Message createMessage() {
		return new JSONMessage();
	}

	
}
