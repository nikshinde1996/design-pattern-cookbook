# Adaptor Design Pattern
1. The adaptor design pattern converts an interface of a class into another interface that client expects.
	- works as a bridge between two incompatible interfaces.
	- Also known as the WRAPPER. It lets classes work together that would not otherwise. 
	- Classified as structural design pattern since it combines the capabilities of two independent interfaces. 
2. The adaptor acts to decouple the client from the implemented interface.
	- Encapsulates the future changes.
	- Client does not need to be modified each time it operates on different interfaces.
3. Full of good Object Oriented design principles
	- Binds the client to an interface not the implementation.
	- Uses the object composition to wrap the adaptee with an altered interface.
	
#### Client usage
1. Client makes a request to the adaptor by calling the method on it using the target interface.
2. The adaptor translates the request into one or more calls on the adaptee using the adaptee interface.
3. The client receives the results, and never knows there's an adaptor doing all the translation.
4. Adaptor frees you from worrying about the existing interfaces

#### Implementation techniques
1. object adaptors
	- relies on the object composition.
	- an advantage is that it can adapt an adaptee class and any of its subclass (because of composition)
2. class adaptors
	- uses multiple inheritance to implement adaptor pattern.
	- not-possible in Java (need multiple-inheritance), we can you interfaces to support the workaround implementation.
	- an advantage is that it does not need to re-implement its entire adaptee, can override behaviour of adaptee since it is just sub-classing