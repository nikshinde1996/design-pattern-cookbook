package bill_pugh_apporoach;

// Bill Pughs approach to create singleton in Java
// This is standard technique to create the Singletons in Java 
public class Singleton {
	
	// an instance attribute
	private int data = 0;
	
	Singleton() {}
	
	public static class SingletonHelper {
		// Nested class is referenced after the getInstance is called
		private static final Singleton uniqueInstance = new Singleton(); 
	}
	
	public static Singleton getInstance() {
		return SingletonHelper.uniqueInstance;
	}

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}
}
