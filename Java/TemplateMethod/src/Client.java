
public class Client {
	public static void main(String args[]) {
		HouseTemplate woodenHouse = new WoodenHouse();
		woodenHouse.buildHouse();
		
		HouseTemplate glassHouse = new GlassHouse();
		glassHouse.buildHouse();
	}
}
