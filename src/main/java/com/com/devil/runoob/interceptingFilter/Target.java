package com.com.devil.runoob.interceptingFilter;

/**
 * @author Hanyanjiao
 * @date 2020/11/4
 */
public class Target {
    public void execute(String request){
        System.out.println("Executing request: "+request);
    }
}
