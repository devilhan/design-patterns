package com.com.devil.runoob.command;


/**
 * @author Hanyanjiao
 * @date 2020/11/3
 */
public class BuyStock implements Order {
    private Stock abcStock;

    public BuyStock(Stock abcStock) {
        this.abcStock = abcStock;
    }

    @Override
    public void execute() {
        abcStock.buy();
    }
}
