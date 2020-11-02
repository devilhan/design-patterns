package com.com.devil.runoob.prototype;

import java.util.Hashtable;

/**
 * @author Hanyanjiao
 * @date 2020/11/2
 */
public class ShapeCache {
    private static Hashtable<String,Shape> shapeMap = new Hashtable<>();

    public static Shape getShape(String shapeId){
        Shape cachedShape = shapeMap.get(shapeId);
        return (Shape) cachedShape.clone();
    }

    public static void loadCache(){
        Circle circle = new Circle();
        circle.setId("1");
        shapeMap.put(circle.getId(),circle);

        Square square = new Square();
        square.setId("2");
        shapeMap.put(square.getId(),square);

        Rectangle rect = new Rectangle();
        rect.setId("3");
        shapeMap.put(rect.getId(),rect);
    }
}
