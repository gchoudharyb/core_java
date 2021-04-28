package in.design.pattern.creational.builder.self;

public class Address {
	private Long addressId;
	private String address;

	public Address(Long addressId, String address) {
		super();
		this.addressId = addressId;
		this.address = address;
	}

	public Address() {
		// TODO Auto-generated constructor stub
	}

	public Long getAddressId() {
		return addressId;
	}

	public void setAddressId(Long addressId) {
		this.addressId = addressId;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Address [addressId=" + addressId + ", address=" + address + "]";
	}

}
