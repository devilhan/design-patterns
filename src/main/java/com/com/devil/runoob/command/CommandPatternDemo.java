package com.com.devil.runoob.command;

/**
 * @author Hanyanjiao
 * @date 2020/11/3
 */
public class CommandPatternDemo {

    public static void main(String[] args){
        Stock abcStock = new Stock();

        BuyStock buyStock = new BuyStock(abcStock);
        SellStock sellStock = new SellStock(abcStock);

        Broker broker = new Broker();
        broker.takeOrder(buyStock);
        broker.takeOrder(sellStock);

        broker.placeOrder();
    }
}
