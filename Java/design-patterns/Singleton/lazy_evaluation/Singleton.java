package lazy_evaluation;

public class Singleton {
	
	// private reference to one and only one instance
	private static Singleton uniqueInstance = null;
	
	// private instance attribute
	int data = 0;
	
	// private constructor
	// no client can instantiate the singleton constructor
	private Singleton() {}
	
	public static Singleton getInstance() {
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
