
public class Client {
	public static void main(String args[]) {
		ShoppingCart sc = new ShoppingCart();
		sc.addItem(new Item("dog nibbles", 3000));
		sc.addItem(new Item("dog biscuits", 400));
		sc.addItem(new Item("dog shampoo", 200));
		
		// pay by paypal
		sc.pay(new PaypalStrategy("foobar@gmail.com", "password"));
		
		// pay by credit/debit card
		sc.pay(new CreditCardStrategy("Foo Bar", "4555-3434-2324-5656", "123", "20/12"));
	}
}
