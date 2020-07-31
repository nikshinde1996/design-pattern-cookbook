package AbstractCreator;

public class Client {
	public static void main(String args[]) {
		
		// Client calls the factory method of subclasses this
		// implicitly calls the factory method of particular product.
		Shape shape1 = new CircleFactory().getShape();
		shape1.draw();
	}
}
