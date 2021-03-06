package com.com.devil.runoob.state;


/**
 * @author Hanyanjiao
 * @date 2020/11/4
 */
public class StatePatternDemo {
    public static void main(String[] args){
        Context context = new Context();

        StartState startState = new StartState();
        startState.doAction(context);

        System.out.println(context.getState().toString());

        StopState stopState = new StopState();
        stopState.doAction(context);
        System.out.println(context.getState().toString());
    }
}
