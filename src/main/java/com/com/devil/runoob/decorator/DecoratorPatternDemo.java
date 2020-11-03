package com.com.devil.runoob.decorator;

/**
 * @author Hanyanjiao
 * @date 2020/11/3
 */
public class DecoratorPatternDemo {
    public static void main(String[] args){
        Shape circle = new Circle();
        ShapeDecorator redCircle = new RedDecorator(new Circle());
        ShapeDecorator redRect = new RedDecorator(new Rectangle());
        ShapeDecorator redSquare = new RedDecorator(new Square());

        System.out.println("Circle with normal border");
        circle.draw();

        System.out.println("Circle with red border");
        redCircle.draw();

        System.out.println("Rect with red border");
        redRect.draw();

        System.out.println("Square with red border");
        redSquare.draw();
    }
}
