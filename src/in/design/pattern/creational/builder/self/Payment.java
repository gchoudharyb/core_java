package in.design.pattern.creational.builder.self;

public class Payment {
	private Long paymentId;

	private PAYMENT_TYPE payment_TYPE;
	private String instrumentRefNo;
	private String benificiaryName;
	private Address benificiaryAddress;
	public Long getPaymentId() {
		return paymentId;
	}
	public void setPaymentId(Long paymentId) {
		this.paymentId = paymentId;
	}
	public PAYMENT_TYPE getPayment_TYPE() {
		return payment_TYPE;
	}
	public void setPayment_TYPE(PAYMENT_TYPE payment_TYPE) {
		this.payment_TYPE = payment_TYPE;
	}
	public String getInstrumentRefNo() {
		return instrumentRefNo;
	}
	public void setInstrumentRefNo(String instrumentRefNo) {
		this.instrumentRefNo = instrumentRefNo;
	}
	public String getBenificiaryName() {
		return benificiaryName;
	}
	public void setBenificiaryName(String benificiaryName) {
		this.benificiaryName = benificiaryName;
	}
	public Address getBenificiaryAddress() {
		return benificiaryAddress;
	}
	public void setBenificiaryAddress(Address benificiaryAddress) {
		this.benificiaryAddress = benificiaryAddress;
	}

}
