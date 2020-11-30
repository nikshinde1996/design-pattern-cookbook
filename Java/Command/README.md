### Command Design Pattern - BEHAVIOURAL DESIGN PATTERN
* This pattern encapsulates the request as an object. It lets us parameterise clients with different requests.
* The command object encapsulates the request by binding together the set of actions on a specific receiver
* The commands execute method can store the state for reversing its effect of the command, thus supports the "UNDO" operation.
* This pattern supports the logging changes, so all commands can be reapplied if the system crashes.
* This pattern is data driven design pattern - Its widely used for undo/redo operations.
* very useful when we model transactions.
* makes our code more extensible as we can add new commands without changing existing code.
* this pattern allows us to issue request to objects without knowing anything about the operation.

### When to use?
* When you want to parameterise the objects by an ACTION to perform.
* When you want to specify, queue, and execute the requests at different times.
* When you want to support undo/ redo.
* When you want to support logging changes. (which can be reapplied incase of system crash) 

### Advantages
* Code is extensible

### Disadvantages
* Code gets huge and confusing with high number of action methods

### Participants
* Command
    * declares an interface for all commands
    * a command is invoked through its execute method
    * may include undo/redo methods.
    * Commands are First class object (they can be manipulated and extended)
* ConcreteCommand
    * defines the binding between receiver object and the action
* Client
    * Creates the ConcreteCommand object and sets its receiver
* Invoker
    * Asks the command to carry out the request by calling its execute method.
* Receiver
    * Knows how to perform the work needed to carry out the request
    * Receiver implementation is separate from command implementation.
