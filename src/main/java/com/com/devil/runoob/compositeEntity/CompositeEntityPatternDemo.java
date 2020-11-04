package com.com.devil.runoob.compositeEntity;

/**
 * @author Hanyanjiao
 * @date 2020/11/4
 */
public class CompositeEntityPatternDemo {
    public static void main(String[] args){
        Client client = new Client();
        client.setData("Test","Data");
        client.printData();

        client.setData("Second Test","New Data");
        client.printData();
    }
}
