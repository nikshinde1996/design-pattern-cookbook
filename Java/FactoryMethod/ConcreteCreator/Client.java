package ConcreteCreator;

public class Client {
	public static void main(String srgs[]) {
		// Concrete factory implementation has a single factory method
		// We are required to pass the unique class info, based on which specific
		// class will be instantiated in factory method

		Shape shape1 = new ConcreteShapeFactory().getShape("CIRCLE");
		shape1.draw();
		
		// rectangle shape
		Shape shape2 = new ConcreteShapeFactory().getShape("RECTANGLE");
		shape2.draw();
	}
}
