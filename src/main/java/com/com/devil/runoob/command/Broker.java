package com.com.devil.runoob.command;




import java.util.ArrayList;
import java.util.List;

/**
 * @author Hanyanjiao
 * @date 2020/11/3
 */
public class Broker {
    private List<Order> orderList = new ArrayList<Order>();

    public void takeOrder(Order order){
        orderList.add(order);
    }

    public void placeOrder(){
        for (Order order:orderList){
            order.execute();
        }
        orderList.clear();
    }
}
