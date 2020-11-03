package com.com.devil.runoob.flyweight;

import java.util.HashMap;

/**
 * @author Hanyanjiao
 * @date 2020/11/3
 */
public class ShapeFactory {
    private static final HashMap<String,Shape> circleMap = new HashMap<>();

    public static Shape getCircle(String color){
        Circle circle = (Circle) circleMap.get(color);

        if (circle == null){
            circle = new Circle(color);
            circleMap.put(color,circle);
            System.out.println("Creating circle of color:"+color);
        }
        return circle;
    }
}
