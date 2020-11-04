package com.com.devil.runoob.strategy;

/**
 * @author Hanyanjiao
 * @date 2020/11/4
 */
public class OperationSubtract implements Strategy {
    @Override
    public int doOperation(int num1, int num2) {
        return num1 - num2;
    }
}
