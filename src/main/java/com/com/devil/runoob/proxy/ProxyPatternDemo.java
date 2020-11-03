package com.com.devil.runoob.proxy;

/**
 * @author Hanyanjiao
 * @date 2020/11/3
 */
public class ProxyPatternDemo {
    public static void main(String[] args){
        Image image = new ProxyImage("test_10.jpg");

        image.display();
        System.out.println("----------");
        image.display();
    }
}
