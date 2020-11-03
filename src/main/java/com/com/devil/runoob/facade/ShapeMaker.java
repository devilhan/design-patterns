package com.com.devil.runoob.facade;

/**
 * @author Hanyanjiao
 * @date 2020/11/3
 */
public class ShapeMaker {

    private Shape circle;
    private Shape square;
    private Shape rect;

    public ShapeMaker() {
        circle = new Circle();
        square = new Square();
        rect = new Rectangle();
    }

    public void drawCircle(){
        circle.draw();
    }

    public void drawSquare(){
        square.draw();
    }

    public void drawRectangle(){
        rect.draw();
    }
}
