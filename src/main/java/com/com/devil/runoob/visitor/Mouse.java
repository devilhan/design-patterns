package com.com.devil.runoob.visitor;

/**
 * @author Hanyanjiao
 * @date 2020/11/4
 */
public class Mouse implements ComputerPart {
    @Override
    public void accept(ComputerPartVisitor computerPartVisitor) {
        computerPartVisitor.visit(this);
    }
}
