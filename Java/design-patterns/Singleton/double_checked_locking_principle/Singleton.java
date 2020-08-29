package double_checked_locking_principle;

public class Singleton {
	
	// the reference to one and only instance.
	// volatile keyword ensures that the multiple threads handle the unique
	// instance variable correctly when it is been initialized to single instance
	private volatile static Singleton uniqueInstance = null;
	
	// an instance attribute
	private int data = 0;

	// Private since, so client can create the instance of Singleton
	private Singleton() {}
	
	public static Singleton getInstance() {
		if(uniqueInstance == null) {
			// we only synchronize the first time through this helps to 
			// improve performance, by avoiding unnecessary synchronization check 
			synchronized(Singleton.class) {
				if(uniqueInstance == null) {
					uniqueInstance = new Singleton();
				}
			}
		}
		return uniqueInstance;
	}
	
	public void setData(int data) {
		this.data = data;
	}
	
	public int getData() {
		return data;
	}
}
