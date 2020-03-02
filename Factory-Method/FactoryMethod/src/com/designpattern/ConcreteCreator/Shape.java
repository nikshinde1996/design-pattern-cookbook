package com.designpattern.ConcreteCreator;

interface Shape {
    public void draw();
}

// These are the Products,
// In Concrete creator we need to create all the products, bu only one
// creator class
class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Inside Rectangle::draw() method.");
    }
}

class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("Inside Circle::draw() method.");
    }
}
class Square implements Shape {
    @Override
    public void draw() {
        System.out.println("Inside Square:: draw() method.");
    }
}