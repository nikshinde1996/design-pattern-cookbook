package com.designpattern;

// The factory of factories. This class is the abstraction provided
// by the Abstract factory Pattern.
// Client will use this abstraction to get the required Factory
public class FactoryProducer {
    public static AbstractFactory getAbstractFactory(String choice) {
        if(choice.equalsIgnoreCase("SHAPE")) {
            return new ShapeFactory();
        }
        if(choice.equalsIgnoreCase("COLOR")) {
            return new ColorFactory();
        }
        return null;
    }
}
