package com.com.devil.runoob.serviceLocator;

/**
 * @author Hanyanjiao
 * @date 2020/11/4
 */
public class Service1 implements Service {
    @Override
    public String getName() {
        return "Service1";
    }

    @Override
    public void execute() {
        System.out.println("Executing Service1");
    }
}
