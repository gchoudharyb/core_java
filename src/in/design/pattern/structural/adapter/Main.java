package in.design.pattern.structural.adapter;

public class Main {
	public static void main(String[] args) {
		ClientClass clientClass = new ClientClass();
		ServiceProvidercClassAdapter serviceProvidercClassAdapter = new ServiceProvidercClassAdapter();
		clientClass.getService(serviceProvidercClassAdapter);
		
		
		ServiceProvidercObjectAdapter providercObjectAdapter = new  ServiceProvidercObjectAdapter();
		clientClass.getService(providercObjectAdapter);
	}
}
