### Iterator Design Pattern - BEHAVIORAL DESIGN PATTERN
* This design pattern provides the way to access the elements of the aggregate objects sequentially without exposing its underlying implementation.
* An iterator is generally used to traverse the container to access its elements.
* JDK example : Commonly used in collection framework,
* It places the task of iteration on the iterator object, and not on the aggregate

### Advantages
* Iterators make it easy to change the traversal algortithms.
* The implementation supports variations in the traversal of an aggregate.
* more than one traversal can be pending on the aggregate.

### Participants
* Iterator
    * Defines an interface for accessing and iterating the elements.
* ConcreteIterator
    * Implements Iterator interface
    * Tracks the current position in the traversal of aggregate
* Aggregate
    * Defines an interface for creating an iterator object
    * Its an collection of objects (data) 
* ConcreteAggregate
    * Implements the interface of the iterator creator. 