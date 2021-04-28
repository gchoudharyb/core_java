package in.design.pattern.creational.builder.self;

public interface PaymentDtoBuilderInterface {
	PaymentDtoBuilderInterface withPaymentId(Long paymentId);

	PaymentDtoBuilderInterface withPaymentType(PAYMENT_TYPE payment_TYPE);

	PaymentDtoBuilderInterface withInstrumentNo(String instrumentRefNo);

	PaymentDtoBuilderInterface withBeneName(String benificiaryName);

	PaymentDtoBuilderInterface withBeneAddress(Address benificiaryAddress);

	PaymentDto build();

	PaymentDto getPaymentDto();

}
