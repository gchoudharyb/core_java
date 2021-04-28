package in.design.pattern.creational.builder.self;

public class Client {
public static void main(String[] args) {
	Payment payment = new  Payment();
	payment.setBenificiaryAddress(new Address(1L, "Noida Up"));
	payment.setBenificiaryName("Gaurav");
	payment.setPayment_TYPE(PAYMENT_TYPE.IFT);
	payment.setPaymentId(1L);
	payment.setInstrumentRefNo("1010202020");
	PaymentDtoBuilderInterface paymentDtoBuilder = new PaymentDtoBuilder();
	PaymentDto paymentDto = paymentDtoBuilder.withBeneAddress(payment.getBenificiaryAddress()).withPaymentType(payment.getPayment_TYPE()).build();
	System.out.println(paymentDto);
	System.out.println(paymentDtoBuilder.getPaymentDto());
	
}

}
