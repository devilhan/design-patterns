package com.com.devil.runoob.businessDelegate;

/**
 * @author Hanyanjiao
 * @date 2020/11/4
 */
public class BusinessDelegatePatternDemo {
    public static void main(String[] args){
        BusinessDelegate businessDelegate = new BusinessDelegate();
        businessDelegate.setServiceType("EJB");

        Client client = new Client(businessDelegate);
        client.doTask();

        businessDelegate.setServiceType("JMS");
        client.doTask();
    }
}
