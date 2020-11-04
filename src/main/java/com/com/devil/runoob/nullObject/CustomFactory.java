package com.com.devil.runoob.nullObject;

/**
 * @author Hanyanjiao
 * @date 2020/11/4
 */
public class CustomFactory {
    public static final String[] names = {"Rob","Joe","Julie"};

    public static AbstractCustomer getCustomer(String name){
        for (int i=0;i<names.length;i++){
            if (names[i].equalsIgnoreCase(name)){
                return new RealCustomer(name);
            }
        }
        return new NullCustomer();
    }
}
