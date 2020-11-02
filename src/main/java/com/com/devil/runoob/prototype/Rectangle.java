package com.com.devil.runoob.prototype;

/**
 * @author Hanyanjiao
 * @date 2020/11/2
 */
public class Rectangle extends Shape {

    public Rectangle() {
        type = "Rectangle";
    }

    @Override
    void draw() {
        System.out.println("Inside Rectangle::draw method.");
    }
}
