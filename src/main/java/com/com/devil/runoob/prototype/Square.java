package com.com.devil.runoob.prototype;

/**
 * @author Hanyanjiao
 * @date 2020/11/2
 */
public class Square extends Shape {
    public Square() {
        type = "Square";
    }

    @Override
    void draw() {
        System.out.println("Inside Square::draw() method.");
    }
}
