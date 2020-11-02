package com.com.devil.runoob.bridge;

/**
 * @author Hanyanjiao
 * @date 2020/11/2
 */
public abstract class Shape {

    protected DrawAPI drawAPI;
    protected Shape(DrawAPI drawAPI){
        this.drawAPI = drawAPI;
    }

    public abstract void draw();
}
