package com.designpattern.ConcreteCreator;

public class Client {
    public static void main(String args[]) {
        // In Concrete Creator we don't need to create the Factory method for
        // each product, just create the factory method for main creator
        // and get classes for each Product
        ShapeFactory shapeFactory = new ShapeFactory();

        Shape circleShape = shapeFactory.getShape("CIRCLE");
        circleShape.draw();

        Shape rectangleShape = shapeFactory.getShape("RECTANGLE");
        rectangleShape.draw();

        Shape squareShape = shapeFactory.getShape("SQUARE");
        squareShape.draw();
    }
}
