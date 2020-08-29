### Factory Method
1.  One of the simplest design patterns, provides the best way to create an object 
    * a creational design pattern
    * ensures that class has only one instance and provides GLOBAL point of access to it.


#### Advantages


#### Disadvantages


#### Ways of Implementation

1. Lazy evaluation approach
	* Implementation isn't thread-safe.
	* There are potential chances of race condition
	
2. Synchronized approach
	* Implementation is thread-safe
	* Straight forward and effective.
	* Used when performance is not critical for application but it is multi threaded.
	* bottleneck: 
		- Due to synchronized nature all the objects will have to wait or the check whether the object already exists
		- reduces performance because of the cost associated with the synchronized methods.

3. Double checked locking principle
	* Improvisation over the synchronized approach.
	* This approach uses the synchronized block inside the IF block with an additional check to ensure the 
		that the only once instance of the class is created.
		- The intent is to optimize away the unnecessary locking and increase the performance.
		- The synchronization check happens at most once, so it will not be a bottleneck. (basically with this technique we first check if instance is created and if-not only then use synchronized check). So thread-safety is checked once.
	
4. Eager evaluation approach
	* The instance of the Singleton class is created at the time of class loading
		- The easiest method of creating the singleton class
		- The major drawback is the instance is created even if the client application is not using it
		- we rely on JVM to create the unique instance of the Singleton when the class is loaded. (JVM guarantees that the unique instance will be created before any thread accesses the static unique instance variable)
		- If Singleton class is not using the lot of resources, then this is the approach to use.
		- Choose this technique wisely, if you want class instantiation only when you require or call the getInstance method.   
	
5. Bill Pugh approach
	* Most widely used method to create the Singleton class
	* Does not require synchronization, is thread safe and only creates the client when client needs it.
	* Easy to understand and implement, regarded as standard method to implement Singletons in Java.

