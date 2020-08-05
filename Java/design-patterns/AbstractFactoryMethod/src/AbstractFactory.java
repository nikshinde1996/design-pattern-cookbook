package src;

public abstract class AbstractFactory {
	public abstract Shape getShape(String shape);
	public abstract Color getColor(String color);
}

class ShapeFactory extends AbstractFactory {
	public Shape getShape(String shapeType) {
		if(shapeType == null) {
			return null;
		}
		if(shapeType.equals("CIRCLE")) {
			return new Circle();
		} else if(shapeType.equals("SQUARE")) {
			return new Square();
		} else if(shapeType.equals("RECTANGLE")) {
			return new Rectangle();
		}
		return null;
	}

	@Override
	public Color getColor(String colorType) {
		// implementing abstract factory method of other products
		// is overhead of this design pattern 
		return null;
	}
}

class ColorFactory extends AbstractFactory {

	@Override
	public Shape getShape(String shapeType) {
		return null;
	}

	@Override
	public Color getColor(String colorType) {
		if(colorType == null) {
			return null;
		}
		if(colorType.equals("RED")) {
			return new Red();
		} else if(colorType.equals("GREEN")) {
			return new Green();
		} else if(colorType.equals("BLUE")) {
			return new Blue();
		}
		return null;
	}
	
}