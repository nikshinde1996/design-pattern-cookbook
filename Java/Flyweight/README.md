### Flyweight Design Pattern - STRUCTURAL DESIGN PATTERN
* This pattern uses sharing to support a large number of fine-grained objects efficiently.
* The pattern is primarily used to reduce the number of objects created.
    * Less number of objects reduce the memory usage, which increases the performance.
    * Memory usage is also reduced by sharing data as much as possible, this is crucial for low memory devices like mobile devices, embedded devices.
* Tries to reuse already existing similar kinds of objects by storing them
    * One instance of class can be used to provide many virtual instances.
    * Creates the new object when no matching object is found.
* Flyweight objects are shared and are immutable. (cannot be modified once they are created)

### States in Flyweight design pattern
* Intrinsic design pattern :
    * Can be stored in the flyweight object and is shareable.
    * Intrinsic state is stored by ConcreteFlyweight objects.
* Extrinsic design pattern :
    * Depends on the flyweight context and is not shareable. Client objects define the state and pass the extrinsic state to the flyweight.
    * Extrinsic state is stored or computed by client objects.
    * Clients pass this state to the flyweight when they invoke its operations.

### Advantages of Flyweight Design Pattern
* Objects are shared, thus reduces memory consumption. Increases performance.

### Use when?
* Client is dealing with too many objects
