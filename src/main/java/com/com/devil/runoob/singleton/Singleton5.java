package com.com.devil.runoob.singleton;

/**
 * @author Hanyanjiao
 * @date 2020/11/2
 * 登记式/静态内部类
 */
public class Singleton5 {
    private static class SingletonHolder{
        private static final Singleton5 INSTANCE = new Singleton5();
    }
    private Singleton5(){};
    public static final Singleton5 getInstance(){
        return SingletonHolder.INSTANCE;
    }
}
