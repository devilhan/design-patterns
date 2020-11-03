package com.com.devil.runoob.mediator;

/**
 * @author Hanyanjiao
 * @date 2020/11/3
 */
public class MediatorPatternDemo {
    public static void main(String[] args){
        User robert = new User("Robert");
        User john = new User("John");

        robert.sendMessage("Hi,John!");
        john.sendMessage("Hello,Robert!");
    }
}
