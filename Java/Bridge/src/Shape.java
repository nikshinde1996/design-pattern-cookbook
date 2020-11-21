// Abstract class implementation
public abstract class Shape {
	protected DrawAPI drawAPI;
	
	Shape(DrawAPI drawAPI){
		this.drawAPI = drawAPI;
	}
	
	public abstract void draw();
}

// RefinedAbstraction
class Circle extends Shape {

	Circle(DrawAPI drawAPI) {
		super(drawAPI);
	}

	@Override
	public void draw() {
		this.drawAPI.drawCircle();
	}
}