package com.com.devil.runoob.abstractFactory;

/**
 * @author Hanyanjiao
 * @date 2020/11/2
 */
public class ShapeFactory extends AbstractFactory {
    @Override
    public Shape getShape(String shape) {
        if (shape == null){
            return null;
        }

        if (shape.equalsIgnoreCase("circle")){
            return new Circle();
        }else if (shape.equalsIgnoreCase("square")){
            return new Square();
        }else if (shape.equalsIgnoreCase("rectangle")){
            return new Rectangle();
        }
        return null;
    }

    @Override
    public Color getColor(String color) {
        return null;
    }
}
