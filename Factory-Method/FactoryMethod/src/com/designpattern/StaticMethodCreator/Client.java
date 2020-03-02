package com.designpattern.StaticMethodCreator;

public class Client {
    public static void main(String args[]) {
        // In this manner we use the static method from the ShapeFactory
        // class without instantiating the ShapeFactory creator class
        Shape circleShape = ShapeFactory.getShape("CIRCLE");
        circleShape.draw();

        Shape rectangleShape = ShapeFactory.getShape("CIRCLE");
        rectangleShape.draw();

        Shape squareShape = ShapeFactory.getShape("CIRCLE");
        squareShape.draw();
    }
}
