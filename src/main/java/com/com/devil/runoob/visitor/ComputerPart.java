package com.com.devil.runoob.visitor;

/**
 * @author Hanyanjiao
 * @date 2020/11/4
 */
public interface ComputerPart {
    public void accept(ComputerPartVisitor computerPartVisitor);
}
