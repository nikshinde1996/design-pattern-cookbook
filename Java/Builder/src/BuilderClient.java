package src;

public class BuilderClient {
	public static void main(String args[]) {
		Director director = new Director();
		BuilderInterface carBuilder = new Car();
		BuilderInterface motorCycleBuilder = new MotorCycle();
		
		// Build products using Director and builder interface
		director.construct(carBuilder);
		director.construct(motorCycleBuilder);
		
		// Get products
		Product car = carBuilder.getVehical();
		car.show();
		
		Product motorCycle = motorCycleBuilder.getVehical();
		motorCycle.show();
	}
}
