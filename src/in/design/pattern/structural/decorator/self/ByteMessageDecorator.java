package in.design.pattern.structural.decorator.self;

import java.util.Base64;

public class ByteMessageDecorator implements Messgae {
	private Messgae message;

	public ByteMessageDecorator(Messgae message) {
		super();
		this.message = message;
	}

	@Override
	public String createMessage() {

		return Base64.getEncoder().encodeToString(message.createMessage().getBytes());
	}
}
