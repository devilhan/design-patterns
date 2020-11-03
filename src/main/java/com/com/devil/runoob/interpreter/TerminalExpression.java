package com.com.devil.runoob.interpreter;

/**
 * @author Hanyanjiao
 * @date 2020/11/3
 */
public class TerminalExpression implements Expression {
    private String data;

    public TerminalExpression(String data){
        this.data = data;
    }

    @Override
    public boolean interpret(String context) {
        if (context.contains(data)){
            return true;
        }
        return false;
    }
}
