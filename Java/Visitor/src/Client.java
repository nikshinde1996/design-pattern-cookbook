
public class Client {
	private static int calculatePrice(ItemElement[] items) {
		ShoppingCartVisitor visitor = new ShoppingCartVisitorImp();
		int sum = 0;
		for(ItemElement item : items) {
			sum += item.accept(visitor);
		}
		return sum;
	}
	
	public static void main(String args[]) {
		ItemElement[] items = new ItemElement[5];
		items[0] = new Book(20, "Book1");
		items[1] = new Fruit(20, 20, "Fruit1");
		items[2] = new Book(15, "Book2");
		items[3] = new Fruit(5, 20, "Fruit2");
		items[4] = new Book(10, "Book3");
		
		int total = calculatePrice(items);
		System.out.println("Total cost = " + total);
	}
}
