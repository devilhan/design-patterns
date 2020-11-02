package com.com.devil.runoob.bridge;

/**
 * @author Hanyanjiao
 * @date 2020/11/2
 */
public class RedCircle implements DrawAPI {
    @Override
    public void drawCircle(int radius, int x, int y) {
        System.out.println("Drawing Circle [color : red ,radius:"+radius+",x : "+x+",y: "+y+" ]");
    }
}
