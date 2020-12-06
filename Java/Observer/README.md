### Observer Design Pattern - BEHAVIOURAL DESIGN PATTERN
* The observer design pattern defines a one to many dependency between the objects so that when object changes state, all of its dependencies are notified and updated automatically.
* Many objects needs to be notified whenever an event occurs and want to be updated automatically.
* The observers patterns decouples NOTIFIY-ERS and NOTIFIY-EES.
* Provides loosely coupled design between the objects that interact.
* One of the most commonly used and famous design pattern in the software development.
* This pattern is heavily used in UI toolkits

### Advantages
* The subject and observers are very loosely coupled.
* We can add new observers at any time without updating the subjects.  
* Changes to subjects and observers does not affect each-other and they can be independently used of each-other.

### When to use?
* When multiple objects are dependent on the state of one object.
* When the change in one object requires changing other, you don't know how many.
* When the object should be able to notify the other object about the changes in its states without making assumptions about the other objects. Don't want these objects to be tightly coupled. 

### Participants
* Observer
    * Defines an updating interface for objects that should be notified of the changes in the subject
* ConcreteObserver
    * Maintains the reference to the ConcreteSubjects.
* Subject
    * Knows its observers (contains its list of observers to notify)
    * Any number of observers can observe the subject.
    * Provides and interface for attaching/detaching the observer objects.
* ConcreteSubject
    * Stores the state of interest to ConcreteObserver object.
    * Sends the notification to all its observers when its state changes.
