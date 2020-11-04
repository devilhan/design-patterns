package com.com.devil.runoob.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Hanyanjiao
 * @date 2020/11/4
 */
public class Subject {

    private List<Observer> obServers = new ArrayList<>();

    private int state;

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
        notifyAllObservers();
    }

    public void attach(Observer observer){
        obServers.add(observer);
    }

    private void notifyAllObservers() {
        for (Observer observer:obServers){
            observer.update();
        }
    }
}
