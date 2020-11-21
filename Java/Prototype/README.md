### Prototype Design Pattern - CREATIONAL DESIGN PATTERN
1. This pattern refers to creating the duplicate object while keeping performance in mind. It specifies the kinds of objects to create using prototypical instance and creates the new object using this prototype.
2. Used when the creation of object is costly, requires a lot of time and resources and you have similar object already existing.
3. It provides the mechanism to copy the original object to the new object and then modify it as per our needs. [e.g. In Java it used cloning (shallow copy) or de-serialization is we need deep copies]
4. Key aspect of this pattern is that the client code can make new instances without knowing which specific class is being instantiated.
5. This pattern mandates that the object which you are copying should provide the copying feature.
6. Object creation/ class instantiation is the costly process, this pattern subjugates the process by creating the clone of required object and replacing the values as required.

#### When to use Prototype Design Pattern?

1. When the system is independent of how its products are created, composed and represented. basically it does not case about the creational mechanism.
2. We can use this pattern when we need to instantiate classes at runtime.
	- Dynamic loading
3. When system must create new objects of many types in complex class hierarchy.
4. When the instances of class have one of only a few combinations of states
	- may be it's more convenient to install prototypes and clone them rather than instantiate the class manually.

#### Advantages of Prototype Design Pattern

1. Hides complexities of making new instances from the client.
2. Provides client the option to generate the object whose type is not known.
3. In some circumstances, copying the object can be more efficient than the creating one.
4. Create new instances at much less cost, time and resources.
5. It's more flexible than other creational design patterns since client can install, remove the prototypes are runtime. (dynamic polymorphism)
6. reduces subclassing

#### Disadvantages of Prototype Design Pattern

1. Each subclass has to implement the cloning mechanism
2. Implementing the cloning mechanism can be complicated
	- object do not support the cloning mechanism
	- presence of any kind of circular reference
3. unknown problems in cloning feature (language dependent)

### Participants in implementing Prototype Design Pattern

1. Prototype
	- declares an interface for cloning
2. ConcretePrototype
	- implements and operation of cloning itself
3. Client
	- creates new object by asking prototype to clone itself

