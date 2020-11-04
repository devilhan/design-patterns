package com.com.devil.runoob.interceptingFilter;

/**
 * @author Hanyanjiao
 * @date 2020/11/4
 */
public class InterceptingFilterDemo {
    public static void main(String[] args){
        FilterManager filterManager = new FilterManager(new Target());
        filterManager.setFilter(new DebugFilter());
        filterManager.setFilter(new AuthenticationFilter());

        Client client = new Client();
        client.setFilterManager(filterManager);
        client.sendRequest("HOME");
    }
}
