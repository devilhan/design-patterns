package com.com.devil.runoob.nullObject;

/**
 * @author Hanyanjiao
 * @date 2020/11/4
 */
public class NullCustomer extends AbstractCustomer {
    @Override
    public boolean isNil() {
        return true;
    }

    @Override
    public String getName() {
        return "Not Available in Customer Database";
    }
}
