package com.com.devil.runoob.frontController;

/**
 * @author Hanyanjiao
 * @date 2020/11/4
 */
public class FrontControllerPatternDemo {

    public static void main(String[] args){
        FrontController frontController = new FrontController();
        frontController.dispatchRequest("HOME");
        frontController.dispatchRequest("student");
    }
}
