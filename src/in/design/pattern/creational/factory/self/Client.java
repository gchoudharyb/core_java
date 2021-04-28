package in.design.pattern.creational.factory.self;

public class Client {
	public static void main(String[] args) {
		String getMessage = new IftMessage().getMessage();
		System.out.println(getMessage);
	}
}
