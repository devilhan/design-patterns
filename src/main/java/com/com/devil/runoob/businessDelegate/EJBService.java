package com.com.devil.runoob.businessDelegate;

/**
 * @author Hanyanjiao
 * @date 2020/11/4
 */
public class EJBService implements BusinessService {
    @Override
    public void doProcessing() {
        System.out.println("Processing task by invoking EJB Service");
    }
}
