package src;

import java.util.LinkedList;

public class Product {
	private LinkedList<String> parts;
	
	public Product() {
		this.parts = new LinkedList<String>();
	}
	
	public void add(String item) {
		this.parts.add(item);
	}
	
	public void show() {
		System.out.println("Product build completed as below");
		for(int i=0;i<this.parts.size();i++) {
			System.out.println(this.parts.get(i));
		}
		System.out.println();
	}
}
