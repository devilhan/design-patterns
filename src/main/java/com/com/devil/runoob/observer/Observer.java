package com.com.devil.runoob.observer;

/**
 * @author Hanyanjiao
 * @date 2020/11/4
 */
public abstract class Observer {
    protected Subject subject;

    public abstract void update();
}
