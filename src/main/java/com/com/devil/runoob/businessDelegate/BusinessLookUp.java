package com.com.devil.runoob.businessDelegate;

/**
 * @author Hanyanjiao
 * @date 2020/11/4
 */
public class BusinessLookUp {
    public BusinessService getBusinessService(String serviceType){
        if (serviceType.equalsIgnoreCase("EJB")){
            return new EJBService();
        }else {
            return new JMSService();
        }
    }
}
