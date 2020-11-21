### Bridge Design Pattern
* The bridge design pattern decouples an abstraction from its implemenation so the two can vary independently.
    * decouples the abstract class from its implementation class by providing the bridge between them
    * decoupling - means to have things independently of one another.
    * abstraction - how different things are related to each other conceptually.
    * implementations (here) - means the objects that the abstract class and its derivations use to implement themselves. (not the derivations of the abstract class)
* Useful when creating the complex objects and is independent of the assembly of th eparts of the object.

### Why bridge design pattern?
* This design pattern helps to make the concrete class functionalities independent from the interface implementor class.

### Advantages of builder pattern
* decouples the implementation so that it is not bounded permanently to an interface.
* abstraction and implementation can be extended independently.
* changes to the concrete abstraction classes do not affect the clients.

### Disadvantages of builder pattern
* It does slightly increase the complexity.

### Use when?
* when you want to void permanent binding between an abstraction and its implementation. Using this one can switch/select the implementation at runtime.
* when both the abstractions and their implementations must be extensible by subclassing.
    * lets you combine the different abstractions and implementation and extend them independently.   
* clients code should not have to be recompiled on changing the implementations of the abstraction.
* when you have ton of implementation classes.
* when you want to completely hide the implementation of an abstraction from its clients.
* unlike Adaptor design pattern it is used upfront in the design.

### Participants
* Abstraction 
    * core of the bridge design pattern, defines the crux (abstraction's interface)
    * contains reference to the implementer
* RefinedAbstraction 
    * extends the abstraction, takes the finer detail one level below
* Implementer
    * defines the interface for the implementation classes 
* Concrete implementer 
    * implements the above implementer by providing the concrete implementation.

### Moto
* Prefer composition over inheritance || Favour aggregation over inheritance.
* better over inheritance since the inheritance binds an implementation to the abstraction permanently, thus makes it more difficult to modify, extend and reuse abstractions and implementations independently.
* Bridge design patterns is one of the toughest pattern to understand in part because it's so powerful and applies to so many situations.