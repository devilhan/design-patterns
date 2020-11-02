package com.com.devil.runoob.prototype;

/**
 * @author Hanyanjiao
 * @date 2020/11/2
 */
public class Circle extends Shape {
    public Circle() {
        type = "Circle";
    }

    @Override
    void draw() {
        System.out.println("Inside Circle::draw() method.");
    }
}
