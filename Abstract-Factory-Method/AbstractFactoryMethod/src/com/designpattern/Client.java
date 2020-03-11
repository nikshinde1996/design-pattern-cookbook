package com.designpattern;

public class Client {

    public static void main(String[] args) {
	    // Client will use FactoryProducer class to get the required AbstractFactory
        AbstractFactory shapeFactory = FactoryProducer.getAbstractFactory("SHAPE");
        Shape rectangle = shapeFactory.getShape("RECTANGLE");
        rectangle.draw();

        // color abstract factory
        AbstractFactory colorFactory = FactoryProducer.getAbstractFactory("COLOR");

        Color red = colorFactory.getColor("RED");
        red.fill();
    }
}
