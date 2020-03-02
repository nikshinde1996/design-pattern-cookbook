package com.designpattern.AbstractCreator;

public abstract class AbstractShapeFactory {
    protected abstract Shape factoryMethod();

    // FactoryMethod is hidden behind he getShape(), so
    // client all does is know about the getShape() abstraction.
    public Shape getShape() {
        return factoryMethod();
    }
}

// These are the Abstract Creators, we need to create the
// creator for every product
class RectangleFactory extends AbstractShapeFactory{
    protected Shape factoryMethod() {
        return new Rectangle();
    }
}

class CircleFactory extends AbstractShapeFactory{
    protected Shape factoryMethod() {
        return new Circle();
    }
}

class SquareFactory extends AbstractShapeFactory{
    protected Shape factoryMethod() {
        return new Square();
    }
}
