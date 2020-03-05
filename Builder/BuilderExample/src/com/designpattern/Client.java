package com.designpattern;

public class Client {

    public static void main(String[] args) {
	    System.out.println("Builder pattern demo");
        Director director = new Director();

        // Builder interface for car
        BuilderInterface carBuilder = new Car();

        // Builder interface for the motor cycle
        BuilderInterface motorCycleBuilder = new MotorCycle();

        // Director uses the Builder Interface to create a car
        director.construct(carBuilder);
        Product car = carBuilder.getVehicles();
        car.show();

        // Use Builder interface to build the motorcycle
        director.construct((motorCycleBuilder));
        Product cycle = motorCycleBuilder.getVehicles();
        cycle.show();
    }
}
