package com.designpattern;

public interface BuilderInterface {
    void buildBody();
    void insertWheels();
    void addHeadlights();
    Product getVehicles();
}


class Car implements BuilderInterface{
    private Product product = new Product();

    @Override
    public void buildBody() {
        product.add("Cars body.");
    }

    @Override
    public void insertWheels() {
        product.add("Inserting wheels in Car.");
    }

    @Override
    public void addHeadlights() {
        product.add("Adding headlights to Car.");
    }

    @Override
    public Product getVehicles() {
        return product;
    }
}

class MotorCycle implements BuilderInterface{
    private Product product = new Product();

    @Override
    public void buildBody() {
        product.add("MotorCycles body.");
    }

    @Override
    public void insertWheels() {
        product.add("Inserting wheels in MotorCycle.");
    }

    @Override
    public void addHeadlights() {
        product.add("Inserting wheels in MotorCycle.");
    }

    @Override
    public Product getVehicles() {
        return product;
    }
}