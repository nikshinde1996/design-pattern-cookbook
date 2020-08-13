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
	
3. Double checked locking principle
4. Eager evaluation approach
5. Bill Pugh approach

