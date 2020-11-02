package com.com.devil.runoob.singleton;

/**
 * @author Hanyanjiao
 * @date 2020/11/2
 * 懒汉式 线程安全
 */
public class Singleton2 {
    private static Singleton2 instance;

    private Singleton2(){};

    public static synchronized Singleton2 getInstance(){
        if (instance == null){
            instance = new Singleton2();
        }
        return instance;
    }
}
