package early_evaluation;

public class Singleton {
	
	// this instance is created before the application is started
	// created in static initializer, so code is guaranteed to be 
	private static Singleton uniqueInstance = new Singleton();
	
	private Singleton() {}
	
	public static Singleton getInstance() {
		return uniqueInstance;
	}
}
