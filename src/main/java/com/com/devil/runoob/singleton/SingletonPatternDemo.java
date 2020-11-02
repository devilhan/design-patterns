package com.com.devil.runoob.singleton;

/**
 * @author Hanyanjiao
 * @date 2020/11/2
 */
public class SingletonPatternDemo {
    public static void main(String[] args){
//        SingleObject object = new SingleObject();
        SingleObject object = SingleObject.getInstance();
        object.showMes();
    }
}
