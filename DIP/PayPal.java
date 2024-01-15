public class PayPal implements PayMethod {
	@Override
	public void pay() {
		System.out.println("Paying with PayPal...");
	}
}
