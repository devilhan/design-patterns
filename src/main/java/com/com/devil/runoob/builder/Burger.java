package com.com.devil.runoob.builder;

/**
 * @author Hanyanjiao
 * @date 2020/11/2
 */
public abstract class Burger implements Item {
    @Override
    public Packing packing() {
        return new Wrapper();
    }

    @Override
    public abstract float price();
}
