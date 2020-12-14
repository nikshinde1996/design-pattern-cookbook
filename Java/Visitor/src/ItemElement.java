
public interface ItemElement {
	public int accept(ShoppingCartVisitor visitor);
}

class Book implements ItemElement {
	private int price;
	private String isbnNumber;
	
	public Book(int price, String isbnNumber) {
		this.price = price;
		this.isbnNumber = isbnNumber;
	}
	
	public int getPrice() {
		return this.price;
	}
	
	public String getISBNNumber() {
		return this.isbnNumber;
	}
	
	@Override
	public int accept(ShoppingCartVisitor visitor) {
		return visitor.visit(this);
	}
	
}

class Fruit implements ItemElement {
	private int pricePerKg;
	private int weight;
	private String name;
	
	public Fruit(int pricePerKg, int weight, String name) {
		this.pricePerKg = pricePerKg;
		this.weight = weight;
		this.name = name;
	}
	
	public int getWeight() {
		return this.weight;
	}
	
	public String getName() {
		return this.name;
	}
	
	public int getPricePerKg() {
		return this.pricePerKg;
	}
	
	@Override
	public int accept(ShoppingCartVisitor visitor) {
		return visitor.visit(this);
	}
	
}