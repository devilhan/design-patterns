package com.com.devil.runoob.factory;

/**
 * @author Hanyanjiao
 * @date 2020/11/2
 * 使用该工厂，通过传递类型信息来获取实体类的对象
 */
public class FactoryPatternDemo {
    public static void main(String[] args){
        ShapeFactory shapeFactory = new ShapeFactory();

        //获取 Circle 的对象，并调用它的draw方法
        Shape circle = shapeFactory.getShape("circle");
        circle.draw();

        //获取 Rectangle 的对象，并调用它的draw方法
        Shape rect = shapeFactory.getShape("rectangle");
        rect.draw();

        //获取 square 的对象，并调用它的draw方法
        Shape square = shapeFactory.getShape("square");
        square.draw();

    }
}
