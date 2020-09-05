### Builder Design Pattern
* The builder design pattern separates the construction of complex object from its representation.
    * It uses the same construction processes to create the same object. these processes can create different representations of the object.
    * use simple objects and step by step approach to create the object.
    * The Builder class is independent of other objects.
* Useful when creating the complex objects and is independent of the assembly of the parts of the object.

### Why builder design pattern?
* This design pattern was introduced to solve the problems with the factory and the abstract-factory design pattern, since these patterns do not work well when the Object to be created contains a lot of attributes.
* Three main issues (with Factory pattern and Abstract-factory pattern)
    * too many argument to pass from client to Factory class
        * can be error prone
        * hard to maintain order of the arguments on the client side.
    * some of the parameters might be optional, unlike in factory pattern where we are forced to send all the parameters.
    * object can be heavy and its creation can be complex.
        * all that complexity will be part of factory class which can further cause major confusion.
* Builder pattern provides the  way to build the object step-by-step, and provides the way that will actually return the final complex object.

### Advantages of builder pattern
* It encapsulates the way a complex object is constructed.
    * Separates the code of assembling from its representation.
    * hides the complex construction process and represents it as a simple process.
* Allows object to be constructed in multisteps and varying process (unlike the one-step factories), programming to an interface.
* Hides the internal representation from the clients.
* Focuses on "how the product will be mode?"
* Isolates code for construction and representation, Improves modularity. 

### Disadvantages of builder pattern
* Often used for building composite structures
* constructing object requires more domain-knowledge of the client, than when using the factories.
* requires some amount of code duplication.

### Use when?
* when the algorithm for creating the complex object should be independent of the parts that makeup the objects and how they are assembled.
* The construction process must allow different representations for the object that is created.
* when not? : We should NOT use this pattern, if we want a mutable object. i.e. the object that can be modified or changed after the creational process is over.

#### Main participants
* Builder
    * specifies an abstract interface for creating parts of a product object.
    * must be general enough to allow construction of products of all kinds of concrete builders.
* Concrete builder
    * constructs and assembles the parts of the product by implementing the Builder interface.
    * defines and keep tracks of the representation it creates
    * provides an interface for retrieving the product.
* Director
    * constructs and object using the Builder interface.
* Product
    * represents the complex object under creation
