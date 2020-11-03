package com.com.devil.runoob.decorator;

/**
 * @author Hanyanjiao
 * @date 2020/11/3
 */
public abstract class ShapeDecorator implements Shape {
    protected Shape decoratorShape;

    public ShapeDecorator(Shape decoratorShape) {
        this.decoratorShape = decoratorShape;
    }

    @Override
    public void draw() {
        decoratorShape.draw();
    }
}
