package com.com.devil.runoob.cor;

/**
 * @author Hanyanjiao
 * @date 2020/11/3
 */
public class ConsoleLogger extends AbstractLogger {
    public ConsoleLogger(int level){
        this.level = level;
    }


    @Override
    protected void write(String message) {
        System.out.println("Standard Console::Logger: "+message);
    }
}
