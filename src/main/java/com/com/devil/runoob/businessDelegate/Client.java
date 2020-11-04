package com.com.devil.runoob.businessDelegate;

/**
 * @author Hanyanjiao
 * @date 2020/11/4
 */
public class Client {
    BusinessDelegate delegate;

    public Client(BusinessDelegate delegate) {
        this.delegate = delegate;
    }

    public void doTask(){
        delegate.doTask();
    }
}
