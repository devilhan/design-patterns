package com.com.devil.runoob.builder;

/**
 * @author Hanyanjiao
 * @date 2020/11/2
 * 创建一个表示食物条目接口
 */
public interface Item {
    public String name();

    public Packing packing();

    public float price();
}
