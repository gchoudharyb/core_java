package in.design.pattern.creational.builder.self;

public class PaymentDto {

	private Long paymentId;

	private PAYMENT_TYPE payment_TYPE;
	private String instrumentRefNo;
	private String benificiaryName;
	private Address benificiaryAddress;

	public PaymentDto(Long paymentId, PAYMENT_TYPE payment_TYPE, String instrumentRefNo, String benificiaryName,
			Address benificiaryAddress) {
		super();
		this.paymentId = paymentId;
		this.payment_TYPE = payment_TYPE;
		this.instrumentRefNo = instrumentRefNo;
		this.benificiaryName = benificiaryName;
		this.benificiaryAddress = benificiaryAddress;
	}

	public Long getPaymentId() {
		return paymentId;
	}

	public void setPaymentId(Long paymentId) {
		this.paymentId = paymentId;
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

	public PAYMENT_TYPE getPayment_TYPE() {
		return payment_TYPE;
	}

	public void setPayment_TYPE(PAYMENT_TYPE payment_TYPE) {
		this.payment_TYPE = payment_TYPE;
	}

	@Override
	public String toString() {
		return "PaymentDto [paymentId=" + paymentId + ", payment_TYPE=" + payment_TYPE + ", instrumentRefNo="
				+ instrumentRefNo + ", benificiaryName=" + benificiaryName + ", benificiaryAddress="
				+ benificiaryAddress + "]";
	}

}
