package com.com.devil.runoob.observer;

/**
 * @author Hanyanjiao
 * @date 2020/11/4
 */
public class BinaryObserver extends Observer {

    public BinaryObserver(Subject subject) {
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println("Binary String : "+Integer.toBinaryString(subject.getState()));
    }
}
