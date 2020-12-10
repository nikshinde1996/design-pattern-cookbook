
public interface PaymentStrategy {
	public void pay(int amount);
}

class CreditCardStrategy implements PaymentStrategy {
	private String name;
	private String cardNumber;
	private String cvvNumber;
	private String dateOfExpiry;
	
	CreditCardStrategy(String name, String cardNumber, String cvvNumber, String dateOfExpiry) {
		this.name = name;
		this.cardNumber = cardNumber;
		this.cvvNumber = cvvNumber;
		this.dateOfExpiry = dateOfExpiry;
	}

	@Override
	public void pay(int amount) {
		System.out.println(amount + " paid with credit/debit card.");
	}	
}


class PaypalStrategy implements PaymentStrategy {
	private String email;
	private String password;
	
	PaypalStrategy(String email, String password) {
		this.email = email;
		this.password = password;
	}

	@Override
	public void pay(int amount) {
		System.out.println(amount + " paid with Paypal account.");
	}	
}
