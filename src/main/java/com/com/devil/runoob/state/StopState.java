package com.com.devil.runoob.state;

/**
 * @author Hanyanjiao
 * @date 2020/11/4
 */
public class StopState implements State {
    @Override
    public void doAction(Context context) {
        System.out.println("Player is in stop state");
        context.setState(this);
    }

    @Override
    public String toString() {
        return "StopState{}";
    }
}
