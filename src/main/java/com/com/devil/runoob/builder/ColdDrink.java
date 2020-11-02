package com.com.devil.runoob.builder;

/**
 * @author Hanyanjiao
 * @date 2020/11/2
 */
public abstract class ColdDrink implements Item {
    @Override
    public Packing packing() {
        return new Bottle();
    }

    @Override
    public abstract float price();
}
