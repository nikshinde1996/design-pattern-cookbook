### Proxy Design Pattern - STRUCTURAL DESIGN PATTERN
* This design pattern provides the surrogate or placeholder for another object to control access to it. Used when we want to provide controlled access of the functionality.
* In situations where client does not or cannot refernce the object directly, this pattern provides the level of indirection when accessing the object.
* A proxy object can act as the intermediatary between the client and the target object.
* Another common use is to provide the wrapper interface for the better performance.

### Types of proxies
* Remote proxy:
    * Manages the interaction between the client and the remote object.
* Virtual proxy:
    * Controls the access to the object that is expensive to instantiate.
    * Allows the creation of memory intensive objects on demand.
* Copy-On-Write proxy:
    * Defers copying (cloning) of objects until it is required by the client actions.
* Protection (Access) proxy:
    * Provides different clients with different levels of access to the target object.

### Advantages of Flyweight Design Pattern
* 

### Participants
* Subject
    * Defines the common interface for the RealSubject and the Proxy.
    * A proxy can be used anywhere the RealSubject is expected.
* Proxy
    * Client interacts with the RealSubject via the proxy.
    * Under the hood the RealSubject does the actual work. Proxy just maintains the refernce to it. Forwards the appropriate request to the ReadSubject.
