### Memento Design Pattern - BEHAVIOURAL DESIGN PATTERN
* The Memento design pattern will capture and externalise the an objects internal state so that the object can be restored to this state later without violating encapsulation.
* The goal is to save the state of the object so that in future we can go back to the specified state of the object.
* Its implemented in such  way that saved state of the object is not accessible outside of the object.
    * Does not break encapsulation.
    * Protects the integrity of the saved data.
* E.g. Rolling back transactions in database
* Mementos are passive. only the originator that creates the memento will assign or retrieve its state
 
### Advantages
* Very efficient in case we are required to implement checkpoints and undo mechanisms. 
* It lets users back out from tentative operations and recover from errors. 
* It's easy to implement and provides easy recovery capability.

### DisAdvantages
* Saving and restoring state can be time consuming
    * Consider using serialisation when you want to save an entire system state.
* Mementos can cause considerable overhead if the amount of data to store is high.

### When to use?
* Use this design pattern when you want to be able to return the previous states of the object.

### Participants
* Memento
    * Stores the internal state of the Originator object.
    * can store as much or little state of the originators internal state as necessary
    * Protects the access to the state only to the originator object. 
    * Has two interfaces
        * Caretaker
            * Sees narrow interface to the Memento, can only pass memento the the other objects.
        * Originator
            * Sees the wider interface, can sees all the data necessary to restore state to previous state.
* Originator
    * originator is the object whose state needs to be saved and restored.
    * Creates a memento containing snapshot of its internal state.
    * Uses the memento to restore its internal state.
* Caretaker
    * Responsible for memento's safekeeping
    * Never operates or examines the content of the memento
    * it's basically the helper class that is responsible for storing and restoring the originators state through the memento object.
