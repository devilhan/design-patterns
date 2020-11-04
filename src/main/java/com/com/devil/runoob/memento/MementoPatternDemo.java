package com.com.devil.runoob.memento;


/**
 * @author Hanyanjiao
 * @date 2020/11/4
 */
public class MementoPatternDemo {
    public static void main(String[] args){
        Originator originator = new Originator();
        CareTaker careTaker = new CareTaker();

        originator.setState("state #1");
        originator.setState("state #2");
        careTaker.add(originator.saveStateToMemento());
        originator.setState("state #3");
        careTaker.add(originator.saveStateToMemento());
        originator.setState("state #4");

        System.out.println("Current state : "+originator.getState());
        originator.getStateFromMemento(careTaker.get(0));

        System.out.println("First saved state: "+originator.getState());
        originator.getStateFromMemento(careTaker.get(1));

        System.out.println("Second saved state: "+originator.getState());
    }
}
