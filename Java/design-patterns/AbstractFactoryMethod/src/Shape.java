package src;

public interface Shape {
	void draw();
}

class Square implements Shape1 {

	@Override
	public void draw() {
		System.out.println("Inside Square::draw() method");
	}	
}

class Circle implements Shape1 {

	@Override
	public void draw() {
		System.out.println("Inside Circle::draw() method");
	}	
}

class Rectangle implements Shape1 {

	@Override
	public void draw() {
		System.out.println("Inside Rectangle::draw() method");
	}	
}