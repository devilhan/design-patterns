package com.com.devil.runoob.interceptingFilter;

/**
 * @author Hanyanjiao
 * @date 2020/11/4
 */
public class DebugFilter implements Filter {
    @Override
    public void execute(String request) {
        System.out.println("request log: "+request);
    }
}
