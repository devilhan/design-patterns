package com.com.devil.runoob.command;

/**
 * @author Hanyanjiao
 * @date 2020/11/3
 */
public class Stock {
    private String name = "ABC";
    private int quantity = 10;

    public void buy() {
        System.out.println("Stock [name :" + name + ",quantity: " + quantity + "]");
    }

    public void sell() {
        System.out.println("Stock [name: " + name + ",quantity: " + quantity + "]");
    }
}
