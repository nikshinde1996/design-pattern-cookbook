
public class Client {
	public static void main(String args[]) {
		Shape shape1 = new Circle(new RedCircle());
		shape1.draw();
		
		Shape shape2 = new Circle(new GreenCircle());
		shape2.draw();
	}
}
