### Template Method Design Pattern - BEHAVIOURAL DESIGN PATTERN
* The Template method defines the skeleton of the algorithm in operation, deferring some steps to subclasses.
    * Lets subclasses redefine certain steps of an algorithm without changing the algorithm structure.
    * helps us generalise the common process at an abstract level, from a set if different procedures.
* It all about creating a template for an algorithm.
    * A template is just method that defines the algorithm as a set of step.
* It enables you to defines the sequence of steps and then override those steps that needs to change.
* Software reuse if the fundamental goal of this method. This pattern is highly used in the class libraries and frameworks development. It's a great design tool for creating frameworks.
* The Factory method is specialisation off the template method.

### When to use?
* Use this design pattern when you need to support multiple algorithms that behave conceptually same but have different implementation for each of their steps.
* When you want to avoid code duplication. Implement variations of algorithms in subclasses.
* When you want to control at what points is subclassing allowed.
* When behaviour of algorithm can vary, you let subclasses implement the behaviour through overriding.

### Participants
* AbstractClass
    * Contains the template method and the abstract versions of the operations used in the template method.
    * The template method defines the skeleton of algorithm.
    * The template makes use of primitive operations to implement an algorithm.
* ConcreteClass
    * Implements the abstract operations, which are called when the templateMethod needs them
