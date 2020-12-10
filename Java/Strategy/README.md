### Strategy Design Pattern - BEHAVIOURAL DESIGN PATTERN
* This design pattern defines the family of algorithms, encapsulates each one and makes them interchangeable.
    * Lets the algorithm vary independently from client to client.
* We can select the behaviour of algorithm at runtime.
    * We can let the client pass the algorithm as the parameter.
    * Can help us to avoid dealing with complex-algorithm specific data structure.
* This allows us to create objects which represents the various strategies and the context object whose behaviour changes as per its strategy object.
* The strategy object changes the executing algorithm of the context object.
* JDK example - Collections.sort(), takes the Comparator parameter, based on different implementations of the Comparator, it sorts the collections in different ways.
* Strategy and Context interact to implement the chosen algorithm.

### Principles of Strategy design pattern
* Object have responsibilities
* Different specific implementations of these responsibilities are manifested by polymorphism.
* By using context, there's no need to manage different implementations of conceptually same algorithm.

### Advantages
* By encapsulating algorithms separately, new algorithms complying with the same interface can be easily introduced.
* Applications can switch strategies at runtime.
* It very easily enables client to choose required algorithms at runtime without using the "switch" statement.
* Simplifies unit testing because each algorithm is in its own class and can be tested through its own interface.
* Strategies can provide different implementations of the same behaviour.

### When to use?
* When many related class only differ in behaviour. Strategies provides a way to configure a class with one of many behaviours.
* When you need different variants of algorithm and you want your application to be flexible to choose any algorithm at runtime.
* When algorithms use data that clients should not know about. Use Strategy pattern to avoid exposing complex algorithm specific data structures.
* When classes define many behaviours that require conditional statements, move related conditional branches into their own Strategy class.

### Participants
* Context
    * Context is configured with the ConcreteStrategy
    * It may define its interface that lets strategy access its data.
* Strategy
    * Declares an interface for all supporting algorithms
    * Context uses this interface to call the algorithm defined by ConcreteStrategy.
    * Specifies how the different algorithms are used.
* ConcreteStrategy
    * Implements the algorithm using the Strategy interface.
