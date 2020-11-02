package com.com.devil.runoob.singleton;

/**
 * @author Hanyanjiao
 * @date 2020/11/2
 * 懒汉式 线程不安全
 */
public class Singleton1 {
    private static Singleton1 instance;

    public static Singleton1 getInstance(){
        if (instance == null){
            instance = new Singleton1();
        }
        return instance;
    }
}
