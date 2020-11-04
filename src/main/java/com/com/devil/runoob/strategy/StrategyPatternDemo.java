package com.com.devil.runoob.strategy;

/**
 * @author Hanyanjiao
 * @date 2020/11/4
 */
public class StrategyPatternDemo {
    public static void main(String[] args){

        Context context = new Context(new OperationAdd());
        System.out.println("10+5= "+context.executeStrategy(10,5));

        context = new Context(new OperationSubtract());
        System.out.println("30-21= "+context.executeStrategy(30,21));

        context = new Context(new OperationMultiply());
        System.out.println("30*8= "+context.executeStrategy(30,8));
    }
}
