package com.com.devil.runoob.command;

/**
 * @author Hanyanjiao
 * @date 2020/11/3
 */
public class SellStock implements Order {

    private Stock abcStock;

    public SellStock(Stock abcStock) {
        this.abcStock = abcStock;
    }

    @Override
    public void execute() {
        abcStock.sell();
    }
}
