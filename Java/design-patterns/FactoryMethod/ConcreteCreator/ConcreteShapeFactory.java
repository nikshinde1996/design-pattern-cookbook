package ConcreteCreator;

public class ConcreteShapeFactory {
	
	public Shape getShape(String shapeName) {
		if(shapeName.equals("CIRCLE")) {
			return new Circle();
		}else if(shapeName.equals("RECTANGLE")) {
			return new Rectangle();
		}else if(shapeName.equals("SQUARE")) {
			return new Square();
		}
		return null;
	}
}
