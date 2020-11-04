package com.com.devil.runoob.nullObject;

/**
 * @author Hanyanjiao
 * @date 2020/11/4
 */
public class RealCustomer extends AbstractCustomer {

    public RealCustomer(String name) {
        this.name = name;
    }

    @Override
    public boolean isNil() {
        return false;
    }

    @Override
    public String getName() {
        return name;
    }
}
