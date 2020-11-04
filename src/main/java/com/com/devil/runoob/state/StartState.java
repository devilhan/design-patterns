package com.com.devil.runoob.state;

/**
 * @author Hanyanjiao
 * @date 2020/11/4
 */
public class StartState implements State {

    @Override
    public void doAction(Context context) {
        System.out.println("Player is in start state");
        context.setState(this);
    }

    @Override
    public String toString() {
        return "StartState{}";
    }
}
