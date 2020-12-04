### Mediator Design Pattern - BEHAVIOURAL DESIGN PATTERN
* This design pattern defines an object that encapsulates how the set of objects interact.
    * It promotes loose coupling by keeping object referring each other explicitly (thus reduce the direct interconnections between the objects)
* The mediator object takes the responsibility of the communication between the group of objects. The other objects in the system are also aware of this mediator.
* The mediator is used to remove communication complexity between multiple classes objects.
* JDK usage - java.lang.reflect.Method.invoke(), Timer.scheduleX() methods user mediator.
* Should not use this pattern just to achieve loose coupling, if the number of mediator grows it becomes troublesome to maintain.
 
### Advantages
* It encourages distribution of behaviour among objects
* It increases the reusability of the objects supported by the mediator by decoupling them from the system.
* Simplifies the maintenance of the system by centralising control logic.
* Simplifies and reduces the variety of messages sent between the objects in the system
* Allows you to replace one object in the structure with different one without affecting the classes and the interfaces.

### When to use?
* Use mediator pattern to centralise the complex communication and control interactions between the objects.

### Participants
* Mediator
    * Defines an interface for communicating with colleague objects.
* ConcreteMediator
    * Implements cooperative behaviour by coordinating colleague objects.
    * Knows and maintains the colleague objects.
    * It routes the requests between communicating objects.
* Colleague
    * Knows its mediator
    * Communicates with the mediator whenever it would have communicated with the colleague
    * Colleagues can send and receive teh request from the medaitor object. 
* ConcreteColleague
