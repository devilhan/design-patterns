package com.com.devil.runoob.businessDelegate;

/**
 * @author Hanyanjiao
 * @date 2020/11/4
 */
public class BusinessDelegate {

    private BusinessLookUp lookUpService = new BusinessLookUp();

    private BusinessService businessService;

    private String serviceType;

    public void setServiceType(String serviceType) {
        this.serviceType = serviceType;
    }

    public void doTask(){
        businessService = lookUpService.getBusinessService(serviceType);
        businessService.doProcessing();
    }
}
