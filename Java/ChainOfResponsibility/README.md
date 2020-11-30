### Chain of Responsibility Design Pattern - BEHAVIORAL DESIGN PATTERN
* This pattern avoid coupling the sender of the request to its receiver by giving more than one object a chance to handle the request.
    * Chain the receiving objects and pass the request along the chain until the object handles it.
    * This pattern processes the series of objects one by one. (n sequential order)
    * lets you send request to an object implicitly through chain of candidate objects. After processing is done, anything remaining can be processed by next object in the chain.
    * JDK example: try-catch block

### When to use?
* When you want to decouple a requests sender and receiver.
* When multiple objects, determined at runtime, are candidates to handle the request.
* When you do not want specify handlers explicity in your code.
* When you want to issues a request to one of several objects with specifying the receiver.
* When multiple objects can handle the request and the handler does not have to be specific object.

### Advanatages
* Decouples the sender of the request and the receiver.
    * frees an object from knowing which other object handles the request.
    * both the sender and receiver have know knowledge of each other.
* Simplifies the object
    * It does not have to know the chain structure or keeps references to it members
    * Keeps single reference to their successor.
* Gives you added flexibility in distributing responsibilities among objects.
    * Allows you to add/remove responsibilties dynamically by changing the members of order of the chain.

### Disadvanatages
* The execution of the request isn't guaranteed.
* It can be hard to observe and debug at runtime.

### Participants
* Handler
    * Defines an interface for handling requests
    * Implements the successor link, dispatches the request to the chain of handlers.
* ConcreteHandler
    * Handles the request it is responsible for.
* Client
    * Initiates the request to ConcreteHandler object on the chain.


