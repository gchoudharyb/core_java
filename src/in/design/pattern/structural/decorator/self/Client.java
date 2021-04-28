package in.design.pattern.structural.decorator.self;

public class Client {
public static void main(String[] args) {
	Messgae messgae = new TextMessage();
	System.out.println(messgae.createMessage());
	Messgae byteMessage = new ByteMessageDecorator(messgae);
	System.out.println(byteMessage.createMessage());
}
}
