package StaticMethodCreator;

public class Client {
	public static void main(String args[]) {
		// Here there is not need to instantiate the
		// FactoryCreator class. The exposed factory method
		// is static method 
		Shape shape1 = StaticShapeFactory.getShape("CIRCLE");
		shape1.draw();
		
		// Always reference to the interface
		Shape shape2 = StaticShapeFactory.getShape("SQUARE");
		shape2.draw();
	}
}
