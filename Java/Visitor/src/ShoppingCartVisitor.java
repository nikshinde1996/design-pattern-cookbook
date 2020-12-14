
public interface ShoppingCartVisitor {
	// implement visit method for each visitor
	int visit(Book book);
	int visit(Fruit fruit);
}

class ShoppingCartVisitorImp implements ShoppingCartVisitor {

	@Override
	public int visit(Book book) {
		int cost = 0;
		if(book.getPrice() > 50) {
			cost = book.getPrice() - 5;
		} else {
			cost = book.getPrice();
		}
		System.out.println("Book ISBN :: " + book.getISBNNumber() + ", cost :: " + cost);
		return cost;
	}

	@Override
	public int visit(Fruit fruit) {
		int cost = fruit.getPricePerKg() * fruit.getWeight();
		System.out.println("Fruit name :: " + fruit.getName() + ", cost :: " + cost);
		return cost;
	}
	
}
