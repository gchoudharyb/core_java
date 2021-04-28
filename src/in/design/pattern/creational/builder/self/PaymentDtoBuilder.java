package in.design.pattern.creational.builder.self;

public class PaymentDtoBuilder implements PaymentDtoBuilderInterface {
	private Long paymentId;

	private PAYMENT_TYPE payment_TYPE;
	private String instrumentRefNo;
	private String benificiaryName;
	private Address benificiaryAddress;
	private PaymentDto paymentDto;
	@Override
	public PaymentDtoBuilderInterface withPaymentId(Long paymentId) {
		// TODO Auto-generated method stub
		this.paymentId=paymentId;
		return  this;
		
	}

	@Override
	public PaymentDtoBuilderInterface withPaymentType(PAYMENT_TYPE payment_TYPE) {
		// TODO Auto-generated method stub
		 this.payment_TYPE=payment_TYPE;
		 return this;
	}

	@Override
	public PaymentDtoBuilderInterface withInstrumentNo(String instrumentRefNo) {
		this.instrumentRefNo=instrumentRefNo;
		return this;
	}

	@Override
	public PaymentDtoBuilderInterface withBeneName(String benificiaryName) {
		this.benificiaryName=benificiaryName;
		return this;
	}

	@Override
	public PaymentDtoBuilderInterface withBeneAddress(Address benificiaryAddress) {
		this.benificiaryAddress=benificiaryAddress;
		return this;
	}

	@Override
	public PaymentDto build() {
		paymentDto = new PaymentDto(paymentId, payment_TYPE, instrumentRefNo, benificiaryName, benificiaryAddress);
		return paymentDto;
	}

	@Override
	public PaymentDto getPaymentDto() {
		return this.paymentDto;
	}

}
