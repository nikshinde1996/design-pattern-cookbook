package com.designpattern.StaticMethodCreator;

public class ShapeFactory {

    // The only difference form the Concrete creator is
    // this static method. By doing this we dont need to create
    // instantiate the ShapeFactory in Client class
    public static Shape getShape(String shapeType) {
        if (shapeType == null) {
            return null;
        } else if (shapeType.equalsIgnoreCase("CIRCLE")) {
            return new Circle();
        } else if(shapeType.equalsIgnoreCase(("SQUARE"))) {
            return new Square();
        } else if(shapeType.equalsIgnoreCase(("RECTANGLE"))) {
            return new Rectangle();
        }
        return null;
    }

}
