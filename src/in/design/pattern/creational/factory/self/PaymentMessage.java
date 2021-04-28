package in.design.pattern.creational.factory.self;

public abstract class PaymentMessage {

	public String getMessage() 
	{
		String message = createMessage();
		return message;
	}
	public abstract String createMessage();
}
