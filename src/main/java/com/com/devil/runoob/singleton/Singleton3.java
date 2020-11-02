package com.com.devil.runoob.singleton;

/**
 * @author Hanyanjiao
 * @date 2020/11/2
 * 饿汉式 线程安全
 */
public class Singleton3 {
    private static Singleton3 instance = new Singleton3();
    private Singleton3(){};
    public static Singleton3 getInstance(){
        return instance;
    }
}
