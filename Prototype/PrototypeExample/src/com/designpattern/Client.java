package com.designpattern;

public class Client {

    public static void main(String[] args) {
	    ShapeCache.loadCache();

	    // Client here is not aware about the class of the share
	    Shape clonedShape = (Shape) ShapeCache.getShape("circleid_1");
	    System.out.println(clonedShape.getId());

        Shape clonedShape2 = (Shape) ShapeCache.getShape("rectangleid_1");
        System.out.println(clonedShape2.getId());

        Shape clonedShape3 = (Shape) ShapeCache.getShape("squareid_1");
        System.out.println(clonedShape3.getId());

        clonedShape3.draw();
    }
}
