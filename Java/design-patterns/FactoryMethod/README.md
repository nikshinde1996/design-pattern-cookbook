### Factory Method
1.  One of the most used design patterns
    * a creational design pattern
    * factories handle details of object creation

2.  This pattern defines an interface for creating an object (CREATOR).
3.  Use this pattern when a class needs to instantiate subclass but doesn't know which one. This pattern lets subclass decide which class to instantiate (using dynamic runtime implementation).
4.  Creates objects without exposing the creational logic to the Client (CREATOR) and refers tp newly created object using common interface (PRODUCT).
5.  Gives us the way to instantiate the concrete types.

### Frameworks

1. Factory method is used in frameworks. Frameworks exists at an abstract level.
2. Frameworks use abstract classes to define and maintain relationships between objects (often responsible for creating these objects).
3. Frameworks should not know and should not be concerned about instantiating specific objects.
4. Use Factory Method pattern when
    * class cannot anticipate the class of objects it must create.
    * class wants its subclasses to specify the objects it creates.
5. Useful when implementing parallel class hierarchies, when some of the responsibilities shift from one class to another.

#### Advantages
1. Decouples the logic of creation of class from the actual logic of creation of class. decouples the implementation of product from its use.
    * Creator is not tightly coupled with ConcreteProduct. So you can add product or change its implementation without affecting the Creator
2. Makes code more robust, loosely coupled and highly cohesive, hence allows to change the code of your application more readily.
3. Promotes the approach of coding to an interface rather than an implementation.
4. Provides abstraction between implementation and client classes using inheritance.
5. Connects parallel class hierarchies.

#### Disadvantages
1. Clients will require to subclass the Creator Class just to create the ConcreteProduct object.
2. Makes code more difficult to read as it may hide all code behind the abstractions, which might hide more abstractions.
3. Can be termed as anti-pattern when incorrectly used. Should not be used to wire entire application
4. Sometimes might create too many object and thus decrease the performance.

### Implementation categories of Factory Method

1. Abstract Creator
	* Much strict implementation of factory-method, more abusive in terms of implementation. 
    * Every product will have its own creator class which be sub-class from the factory class.
    * We need to instantiate all the creator factories in the client code.

2. Concrete Creator
    * There is only one Creator class for all the Products. We need to instantiate the single creator class in client code.

3. Static Creator
    * There is only one Creator class for all the Products. This creator class has the static factory method to create class object. We don't require to instantiate the creator class in client, just use the static method.