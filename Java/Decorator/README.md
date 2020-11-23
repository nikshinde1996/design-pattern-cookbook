### Decorator Design Pattern - STRUCTURAL DESIGN PATTERN
* This design pattern allows to attach additional responsibilites to an object dynamically. Allows to add new functionality to an existing object with altering its structure.
    * create a set of decorator classes that are used to wrap additional functionalities.
* decorators provide more flexible alternative to subclassing for extending functionality.
* Principle : we cannot modify existing functionalities but we can extend them (Open for extenstion, close for modification)
* Many believe that this pattern should be classified as Behavioral pattern, Structural patterns describe how classes and objects are composed to create new structures or functionality.
    * The focus of this design pattern is how you compose objects dynamically to gain new functionality and not the interconnection and communication between the object (behavioral pattern moto)

### Why not inheritance?
* Using decorator we can add new functionalities to the individual object and not entire class.
* decorator is just another object enclosing the another object that adds the border. decorator conforms to the interface of the component it decorates
* Using inheritance for extending functionalties involves compile time changes, where decorator attaches/detaches the functionalities at runtime.

### Advantages of Decorator Design Pattern
* The major advantage is that we can add new functionality to the particular object without disturbing the other objects in the system.
* more flexibility than the static inheritance, attaching/detaching new properties is much easier.
* we can code incrementally.

### Disadvantages of Decorator Design Pattern
* Using this pattern results in large number of small classes, this can be overwhelming.

### Use when?
* When you want to add new functionalities to individual object without disturbing other object in the program.
* when extenstion by subclassing is impractical.

### Trade Offs
* Using decorators make the large number of small classes which can make the design seem more complex.

### Participants
* Component
    * defines the interface for the objects.
* ConcreteComponents
    * defines the object to which can additional responsibilites can be attached.
* Decorator
    * maintains the reference to a component object.
    * defines an interface that conforms to the components interface.
* ConcreteDecorator
    * adds responsibilities to the component.