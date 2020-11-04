package com.com.devil.runoob.observer;

/**
 * @author Hanyanjiao
 * @date 2020/11/4
 */
public class OctalObserver extends Observer {

    public OctalObserver(Subject subject) {
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println("Octal String : "+Integer.toOctalString(subject.getState()));
    }
}
