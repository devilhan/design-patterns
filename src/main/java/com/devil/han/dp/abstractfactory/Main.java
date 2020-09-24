package com.devil.han.dp.abstractfactory;

public class Main {
    public static void main(String[] args) {
        AbastractFactory f1 = new ModernFactory();
        AbastractFactory f2 = new MagicFactory();
        Vehicle c = f1.createVehicle();
        c.go();
        Weapon w = f2.createWeapon();
        w.shoot();
        Food b = f2.createFood();
        b.printName();
    }
}
