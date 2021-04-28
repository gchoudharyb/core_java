package in.design.pattern.structural.adapter;

public class ServiceProvidercClassAdapter extends ServiceProvide implements Customer {

	@Override
	public void getDetails() {
		this.getFullDetails();
		
	}

	@Override
	public void detDetails() {
		this.detFullDetails();;
	}

}
