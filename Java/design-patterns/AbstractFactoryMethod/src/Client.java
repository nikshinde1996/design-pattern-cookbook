package src;

public class Client {
	public static void main(String args[]) {
		AbstractFactory shapeFactory = FactoryProducer.getFactory("SHAPE");
		Shape shape1 = shapeFactory.getShape("SQUARE");
		shape1.draw();
		
		AbstractFactory colorFactory = FactoryProducer.getFactory("COLOR");
		Color color = colorFactory.getColor("RED");
		color.fill();
	}
}
