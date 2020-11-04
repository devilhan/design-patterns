package com.com.devil.runoob.observer;

/**
 * @author Hanyanjiao
 * @date 2020/11/4
 */
public class HexaObserver extends Observer {

    public HexaObserver(Subject subject) {
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println("Hex String : "+Integer.toHexString(subject.getState()).toUpperCase());
    }
}
