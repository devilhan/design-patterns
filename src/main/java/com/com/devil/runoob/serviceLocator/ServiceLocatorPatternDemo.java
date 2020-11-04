package com.com.devil.runoob.serviceLocator;

/**
 * @author Hanyanjiao
 * @date 2020/11/4
 */
public class ServiceLocatorPatternDemo {
    public static void main(String[] args){
        Service service = ServiceLocator.getService("service1");
        service.execute();

        service = ServiceLocator.getService("service2");
        service.execute();

        service = ServiceLocator.getService("service1");
        service.execute();

        service = ServiceLocator.getService("service2");
        service.execute();
    }
}
