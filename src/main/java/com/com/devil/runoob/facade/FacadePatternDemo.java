package com.com.devil.runoob.facade;


/**
 * @author Hanyanjiao
 * @date 2020/11/3
 */
public class FacadePatternDemo {
    public static void main(String[] args){
        ShapeMaker shapeMaker = new ShapeMaker();

        shapeMaker.drawCircle();
        shapeMaker.drawSquare();
        shapeMaker.drawRectangle();
    }
}
