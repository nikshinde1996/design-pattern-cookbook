
public class Client {
	public static void main(String args[]) {
		OFF offState = new OFF();
		
		TV tv = new TV(offState);
		
		// First time button press, ONs the TV
		tv.pressButton();
		
		// Second time button press, OFFs the TV
		tv.pressButton();
	}
}
