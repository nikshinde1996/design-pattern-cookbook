package com.designpattern;

public class Director {
    BuilderInterface builderInterface;

    public void construct(BuilderInterface builderInterface) {
        this.builderInterface = builderInterface;
        builderInterface.buildBody();
        builderInterface.insertWheels();
        builderInterface.addHeadlights();
    }
}
