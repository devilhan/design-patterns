package com.devil.han.dp.factorymethod;

public class CarFactory {
    public Moveable create() {
        System.out.println("a car created!");
        return new Car();
    }
}
