import java.util.ArrayList;
import java.util.List;

// Context class : Entire purpose of this class is to 
// forward request from the client to the Strategy class.
public class ShoppingCart {
	List<Item> items;
	
	public ShoppingCart() {
		this.items = new ArrayList<>();
	}
	
	public void addItem(Item item) {
		this.items.add(item);
	}
	
	public void removeItem(Item item) {
		this.items.remove(item);
	}
	
	public int getTotalPrice() {
		int sum = 0;
		for(Item item: items) {
			sum += item.getPrice();
		}
		return sum;
	}
	
	public void pay(PaymentStrategy paymentStrategy) {
		int amt = getTotalPrice();
		paymentStrategy.pay(amt);
	}
}
