package com.com.devil.runoob.interceptingFilter;

/**
 * @author Hanyanjiao
 * @date 2020/11/4
 */
public class Client {
    FilterManager filterManager;

    public void setFilterManager(FilterManager filterManager) {
        this.filterManager = filterManager;
    }

    public void sendRequest(String request ){
        filterManager.filterRequest(request);
    }
}
