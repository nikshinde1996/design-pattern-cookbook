package src;

public class Client {
	public static void main(String args[]) {
		ShapeCache.loadCache();
		
		Shape1 clonedShape1 = (Shape1) ShapeCache.getShape("1");
		clonedShape1.draw();
		
		Shape1 clonedShape2 = (Shape1) ShapeCache.getShape("2");
		clonedShape2.draw();
		
		Shape1 clonedShape3 = (Shape1) ShapeCache.getShape("3");
		clonedShape3.draw();
	}
}
