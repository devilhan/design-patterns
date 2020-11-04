package com.com.devil.runoob.state;

/**
 * @author Hanyanjiao
 * @date 2020/11/4
 */
public class Context {
    private State state;

    public Context() {
        state = null;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }
}
