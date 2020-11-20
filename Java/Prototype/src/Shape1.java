package src;

public abstract class Shape1 implements Cloneable {
	private String id;
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	protected String type;
	
	abstract void draw();
	
	public String getType() {
		return this.type;
	}
	
	public Object clone() {
		Object clone = null;
		try {
			clone = super.clone();
		}catch(CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return clone;
	}
}

class Rectangle1 extends Shape1 {

	public Rectangle1() {
		type = "Rectangle";
	}
	
	@Override
	void draw() {
		System.out.println("Inside Rectangle1::draw()");
	}
}

class Square1 extends Shape1 {

	public Square1() {
		type = "Square";
	}
	
	@Override
	void draw() {
		System.out.println("Inside Square1::draw()");
	}
}

class Circle1 extends Shape1 {

	public Circle1() {
		type = "Circle";
	}
	
	@Override
	void draw() {
		System.out.println("Inside Circle1::draw()");
	}
}