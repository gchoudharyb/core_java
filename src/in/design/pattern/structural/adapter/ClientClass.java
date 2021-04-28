package in.design.pattern.structural.adapter;

public class ClientClass {
	public void getService(Customer customer) {
		customer.detDetails();
		customer.getDetails();
	}
}
