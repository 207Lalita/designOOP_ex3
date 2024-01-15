public class PaymentController {

	private PayMethod payMethod;
	
	public void setPaymentMethod(PayMethod payMethod) {
		this.payMethod = payMethod;
	}
	
	public void pay() {
		payMethod.pay();
	}
}
