package com.com.devil.runoob.abstractFactory;

/**
 * @author Hanyanjiao
 * @date 2020/11/2
 */
public abstract class AbstractFactory {

    public abstract Shape getShape(String shape);

    public abstract Color getColor(String color);
}
