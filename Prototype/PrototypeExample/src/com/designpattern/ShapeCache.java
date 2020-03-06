package com.designpattern;

import java.util.Hashtable;

public class ShapeCache {
    private static Hashtable<String, Shape> hashtable = new Hashtable<>();

    public static Shape getShape(String shapeId) {
        Shape cachedShape = hashtable.get(shapeId);
        return (Shape) cachedShape.clone();
    }

    /**
     * This part can be done in client as well. Implemented under ShapeCache class
     * just as a helper method and reduce load on client
     */
    public static void loadCache() {
        Shape circle = new Circle();
        circle.setId("circleid_1");
        hashtable.put(circle.getId(), circle);

        Shape rectangle = new Rectangle();
        rectangle.setId("rectangleid_1");
        hashtable.put(rectangle.getId(), rectangle);

        Shape square = new Square();
        square.setId("squareid_1");
        hashtable.put(square.getId(), square);
    }
}
