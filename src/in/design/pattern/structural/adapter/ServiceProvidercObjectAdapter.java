package in.design.pattern.structural.adapter;

public class ServiceProvidercObjectAdapter implements Customer {

	private ServiceProvide serviceProvide;
	
	public ServiceProvidercObjectAdapter() {
		this.serviceProvide=new ServiceProvide();
	}
	@Override
	public void getDetails() {
		serviceProvide.getFullDetails();
		
	}

	@Override
	public void detDetails() {
		serviceProvide.detFullDetails();
		
	}

}
