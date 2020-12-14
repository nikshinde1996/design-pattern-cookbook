### Visitor Design Pattern - BEHAVIOURAL DESIGN PATTERN
* The visitor design pattern represents an operation (method) to be performed on the elements of the object structure (Collection, lists, etc)
    * It lets us define the new operation without changing the class of the elements it operates on.
* It helps us to add the new functionalities to the existing object structure without affecting the old object structure. It follows OPEN/CLOSE principle.
* This pattern is very useful when plugging into public API's.

### When to use?
* When when we have to perform operations on group of similar kinds of objects.
* Useful for adding new set of operations without affecting the existing operations on object.
* Visitor lets you keep related operations together by defining them in one class.
* When you want to decouple logical code from the elements that you are using as input.
* When object structure is shared across many applications, visitor pattern can be used to put operations in just those applications those need them.

### Participants
* Visitor
    * Used to declare the visit operations for all the types of operations visitable classes.
* ConcreteVisitor
    * Implements each method implemented by the Visitor interface.
    * Provides the context of the algorithms and provides stores its local state.
* Element
    * Defines an accept method that takes visitor as an argument.
* ConcreteElement
* ObjectStructure
    * Can enumerate its element.
    * Can be composite or collection such as list/set.