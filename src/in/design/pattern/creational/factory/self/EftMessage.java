package in.design.pattern.creational.factory.self;

public class EftMessage extends PaymentMessage {

	@Override
	public String createMessage() {
		return "EFT MESSAGE";
	}

}
