package AbstractCreator;

public abstract class AbstractShapeFactory {
	protected abstract Shape factoryMethod();
	
	public Shape getShape() {
		return factoryMethod();
	}
	
	// other helper method specific to
	// commonality of Shape objects 
}

// THIS is main disadvantage of using Abstract Creator
// Factory method. For every single product we need to 
// create its own Factory method implementation
class RectangleFactory extends AbstractShapeFactory {

	@Override
	protected Shape factoryMethod() {
		return new Rectangle();
	}
}

class SquareFactory extends AbstractShapeFactory {

	@Override
	protected Shape factoryMethod() {
		return new Square();
	}
}

class CircleFactory extends AbstractShapeFactory {

	@Override
	protected Shape factoryMethod() {
		return new Circle();
	}
}