package com.devil.han.dp.factorymethod;

public class Main {
    public static void main(String[] args) {
        Moveable m = new CarFactory().create();
        m.go();
//        Moveable m = new SimpleVehicleFactory().createBroom();
//        m.go();
    }
}
