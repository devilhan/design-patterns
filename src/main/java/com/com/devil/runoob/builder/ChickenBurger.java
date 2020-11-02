package com.com.devil.runoob.builder;

/**
 * @author Hanyanjiao
 * @date 2020/11/2
 */
public class ChickenBurger extends Burger {
    @Override
    public String name() {
        return "Chicken Burger";
    }

    @Override
    public float price() {
        return 50.5f;
    }
}
