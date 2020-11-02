package com.com.devil.runoob.builder;

/**
 * @author Hanyanjiao
 * @date 2020/11/2
 */
public class Coke extends ColdDrink {
    @Override
    public String name() {
        return "Coke";
    }

    @Override
    public float price() {
        return 30.0f;
    }
}
