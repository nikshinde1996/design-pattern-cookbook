### Abstract Factory Method - CREATIONAL DESIGN PATTERN
1.  Abstract factory provides an interface for creating families of related or dependent objects
without specifying their concrete classes.
    * factory of factories.
    * super factory that creates other factories.
3.  A pattern that creates objects via abstraction. (does not care how its products are created)
4.  The methods of an Abstract factory are implemented as factory methods.
    * factory method is subset of this pattern. abstract factory uses the factory method to create the actual products.
    * provides and encapsulation mechanism to group of individual factories.
5.  There is one often concrete class implemented for each family

### When to use this pattern?
1.  When the system is independent of how its products are created, composed and represented, you can use Abstract-factory or Factory-Method patter.
2.  When we need to deal with multiple factories.
3.  When the problem domain has different families of objects present and each family is used under different circumstances. E.g Incase of 2 product interfaces like shapes and color, we can use Abstract Factory method.
4.  When a family of related product objects is designed to be used together, and you need to enforce this constraint.
5.  When you want to provide class library of products, and you want to reveal just their interfaces and not their implementations.

### Advantages
1.  Isolates client from concrete implementation classes.
    * clients manipulate instances through their abstract interfaces.
    * product class names are isolated in the implementation of concrete factory. they do not appear in client code.
2.  Makes exchanging product families easy.
    * the class of concrete factory appears only once in an application. (when it is instantiated)
    * makes it easy to changes the concrete factory an application uses.
3.  Can support a complete family of products.
    * enforces the use of products from only one family.
4.  Promotes consistency among products.

### Disadvantages
1.  Supporting new kinds of products is difficult.
    * we need to extend the interface and as a result changes will be required to be extended in all the subclasses that have already implemented the interface.

### Relationship with Factory Method

1.  Both encapsulate the object creation to keep applications loosely coupled and less dependent on implementations.
2.  The Abstract Factory delegates the responsibility of object instantiation to another object via composition. (Abstract Factory uses has a relationship to decide which group of factories it's going to use)
    * provides an abstract type for creating a family of products (get a right factory)
    * subclasses of this type defines how the products are produced (the actual factory method)
    * interface has to change of new products are added.
3. Unlike above Factory Method uses inheritance and relies on subclass to handle the desired object instantiation.
    * usually implement the code in Abstract Creator, that makes the use of concrete types the subclasses create.
4.  Use Abstract Factory Method whenever there is family of products to create and you want to make sure that clients create the products that belong together. (Use when we have multiple product interfaces)
5.  Use Factory method when you want to decouple your client code from concrete classes you need to instantiate (Use this then we have single product interface with multiple products)
6. Factory method relies on inheritance while Abstract Factory Method relies on Object composition.


### Class diagram

1.  A client uses object derived from two different Product classes
    * AbstractProductA and AbstractProductB declares as interface for a product object.
    * Such design simplifies, hides implementation and makes system more maintainable.
2.  The client object does not know which particular concrete implementations of product objects it has because the factory object has the responsibility to create them.
3.  The client also does not know, which particular factory it uses because it only knows it has the AbstractFactory Object. Though it has ConcreteFactory1 and ConcreteFactory2 it does not know which to use.
4.  An application typically needs only one instance of ConcreteFactory per product family, (best implementation can be derived from Singleton design pattern)
5.  Abstract Factory only declares an interface for creating products (just like Factory method)
    * most common way is to define a factory method for each product.
6.  If many product families are possible, the concrete factory can be implemented using Prototype pattern.

