### Facade Design Pattern - STRUCTURAL DESIGN PATTERN
* The facade design pattern provides the unified interface to the set of interfaces in the system.
    * It defines the higher level interface that makes the system easier to use. Thus it hides the complexties of the subsystem interfaces.
    * It does not add any new functionality.
* The pattern basically informs us the ways to interact with the system that are easier than the current method. or how we need to use the system in  particular way.
* Facade pattern is more like the helper/wrapper for the subsystem interfaces. It does not completely hide the subsystem interfaces, meaning the client can still access the subsystem interfaces. It juts provides more simpler and easy to use wrapper.
* Subsystem interface as not aware about the facade interface and they do not have any reference to it.

### Why Facade Design Pattern
* Structuring a system into subsystems help reduce the complexity. Interfaces exposed by the classes in the subsystem or the set of subsystem can become quite complex. 
* Facade provides the single unified interface to the more general facilities of the subsystem.

### Advantages of Facade Design Pattern
* Shields the clients from the subsystem components
    * reduces the number of objects the clients have to deal with.
    * makes the subsystem easier to use.
* The pattern supports loose coupling.
    * decouples the client from the complexities of the subsystems.
    * emphasizes the abstraction by hiding the complexities by exposing the single interface. 
* Facades help layer a system and dependencies between the object. Can eliminate the complex and circular dependencies.
* Simplifies porting systems to other platforms.
* Does not prevent client from using subsystem interfaces if they have to.
 
### Disadvantages of Facade Design Pattern
* 

### Use when?
* When you want to provide simpler interface to the complex subsystem.
* When there are many dependencies between the clients and implementation classes of abstraction. Facade can be used to decouple the client from the subsystems.
* When you want to layer out the subsystems. Use facade to define and entrypoint into each subsystem levels or groups.

### Participants
* Facade :
    * The unified interface to the set of interfaces in the system.
    * delegates the client requests to the appropriate subsystem objects
* Subsystem classes :
    * Implements the subsystem functionality and handles the work assigned by the Facade object.
    * Does not have an reference to the Facade.
    * Subsystem objects perform the actual work, facade just delegates the requests (though it can do the intermediate transformation work). 