package synchronised;

public class Singleton {
	
	// private reference to one and only one instance
	private static Singleton uniqueInstance = null;
	
	// private instance attribute
	int data = 0;
	
	// private constructor
	// no client can instantiate the singleton constructor
	private Singleton() {}
	
	// by adding synchronized keyword over this method
	// we force every thread to wait its turn before it can enter the method
	// this makes the method thread-safe incase of concurrent usage
	public static synchronized Singleton getInstance() {
		if(uniqueInstance == null) {
			uniqueInstance = new Singleton(); 
		}
		return uniqueInstance;
	}
	
	// setter for data method
	public void setData(int data) {
		this.data = data;
	}
	
	public int getData() {
		return data;
	}
}
