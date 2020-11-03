package com.com.devil.runoob.decorator;

/**
 * @author Hanyanjiao
 * @date 2020/11/3
 */
public class RedDecorator extends ShapeDecorator {

    public RedDecorator(Shape decoratorShape) {
        super(decoratorShape);
    }

    @Override
    public void draw() {
        decoratorShape.draw();
        setRedBorder(decoratorShape);
    }

    private void setRedBorder(Shape decoratorShape) {
        System.out.println("Border Color:Red");
    }


}
