package com.com.devil.runoob.nullObject;

/**
 * @author Hanyanjiao
 * @date 2020/11/4
 */
public class NullPatternDemo {
    public static void main(String[] args){

        AbstractCustomer customer1 = CustomFactory.getCustomer("Rob");
        AbstractCustomer customer2 = CustomFactory.getCustomer("Julie");
        AbstractCustomer customer3 = CustomFactory.getCustomer("Susan");
        AbstractCustomer customer4 = CustomFactory.getCustomer("Bob");

        System.out.println("Customers:");
        System.out.println(customer1.getName());
        System.out.println(customer2.getName());
        System.out.println(customer3.getName());
        System.out.println(customer4.getName());

    }
}
