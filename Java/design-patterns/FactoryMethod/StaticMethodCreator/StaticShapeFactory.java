package StaticMethodCreator;

public class StaticShapeFactory {
	
	// this factory method is static, 
	// hence we need not instantiate the Factory class in
	// out client code, and can directly call the static
	// factory method to get product class
	public static Shape getShape(String shapeName) {
		if(shapeName.equals("CIRCLE")) {
			return new Circle();
		}
		else if(shapeName.equals("RECTANGLE")) {
			return new Rectangle();
		}
		else if(shapeName.equals("SQUARE")) {
			return new Square();
		}
		return null;
	}
}
