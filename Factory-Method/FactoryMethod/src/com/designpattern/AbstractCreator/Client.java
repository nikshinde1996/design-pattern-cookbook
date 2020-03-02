package com.designpattern.AbstractCreator;

public class Client {

    public static void main(String[] args) {

        // This is most strict implementation of the Factory Method and we need to
        // create the Sub class instance of every single product

        // Shape for type Circle
        Shape shape1 = new CircleFactory().getShape();
        shape1.draw();

        // Shape for type Square
        Shape shape2 = new SquareFactory().getShape();
        shape2.draw();

        // Shape for type Rectangle
        Shape shape3 = new RectangleFactory().getShape();
        shape3.draw();
    }
}
