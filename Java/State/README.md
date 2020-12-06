### State Design Pattern - BEHAVIOURAL DESIGN PATTERN
* The state design pattern allows an object to alter its behaviour when its internal state changes.
    * An objects behaviour is result of the function of its state.
    * The behaviour gets changed at runtime depending on its state.
* With state pattern we remove dependencies on the if-else/ switch conditional statements.
* We create objects which represents various states and the context object whose behaviour varies as its state object changes.
* Its used to provide a systematic and loosely coupled way to achieve state changes through Context and State implementations.

### Advantages
* Puts all behaviour associated with state into one object.
    * improves cohesion.
* Allows state transition to be incorporated into a state object rather than in the monolithic if/switch statements.
* Helps avoid inconsistent states since state change occurs by rebinding one variable rather than several.
* Very convenient to add more states for additional behaviour. (very adaptable)

### DisAdvantages
* This pattern does increase the number of objects.

### When to use?
* When the object behaviour depends on its state and it must change its behaviour at runtime depending on its state.
* When operations have large multipart conditional statements that depends on the object state.

### Participants
* Context
    * Defines the interface of interests of client.
    * Maintains the instance of ConcreteState subclass that defines the current state.
* State 
    * defines an interface for encapsulating the behaviour associated with the particular state of the Context
* ConcreteState subclasses
    * each subclass implements behaviour associated with a state of the Context.