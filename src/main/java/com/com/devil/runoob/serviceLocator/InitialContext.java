package com.com.devil.runoob.serviceLocator;

/**
 * @author Hanyanjiao
 * @date 2020/11/4
 */
public class InitialContext {

    public Object lookup(String jndiName){
        if (jndiName.equalsIgnoreCase("SERVICE1")){
            System.out.println("looking up and creating a new service1 object");
            return new Service1();
        }else if (jndiName.equalsIgnoreCase("SERVICE2")){
            System.out.println("looking up and create a new service2 object");
            return new Service2();
        }
        return null;
    }
}
