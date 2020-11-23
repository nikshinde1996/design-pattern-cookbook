### Composite Design Pattern - STRUCTURAL DESIGN PATTERN
* Composite design pattern composes objects into tree structures to represent part-whole hierarchies.
    * This lets clients treat individual objects and compositions of object uniformly.   
* A composite is the object designed as a composition of one or more similar objects and ll exhitbit similar functionality.
* When we have many object with common functionalities we create the composite object (A class that contians a group of its own objects)
* Allows us to build structures of the objects in the form of the trees.
    * continas both the compositions and the individuals as the nodes/leaves.
* Using composite structures we can apply same operatios over the both composites and individuals (ingnoring the differences)
* Composite design pattern reduces the complexity involved in the tree data structure by providing an interface that allows treating complex and primitive objects uniformly. 
* The main purpose of composite design pattern is to allow treat single instance of object just as you would manipulate the group of them.

### Advantages of Composite Design Pattern
* Makes it easy to add new kinds of components.
* Makes client simpler. Since it does need to worry/ know if they deal with left or composite component  

### Disadvantages of Composite Design Pattern
* It makes it harder to restrict the type of the components of the composiste.
* You cannot rely on the type system to enforce contraints for you.

### Use when?
*  Use composite design pattern when clients need to ignore the difference between the compositions of objects and individual objects.
*  When you are worried about the memory usage. (in composite design pattern the number of objects utilised is less than total number)
*  When you are concerned about the efficiency, (execution time of program can be reduced by sharing of object instead of creating them again)
*  When you are forced to maintain the child ordering. parse trees as components.

### Participants
* Component 
    * declares the interface of objects in the composition
    * implements the default behaviour for the interface common to all classes.
    * declares an interface for accessing and managing its child component.
* Leaf
    * represent left objects in the composition (no leaves).
    * defines the behaviour for object in the composition.
* Composite
    * defines the behaviour for object having children.
    * stores child components (can be leaf/ composite)

### Usage
* Client use the component class interface to interact with the object in the composition structure.

### Tradeoff
* This pattern focuses on transperency and does not strictly follow "Single responsibility desibn principle" and "Interface segregation principle".