package com.com.devil.runoob.visitor;

/**
 * @author Hanyanjiao
 * @date 2020/11/4
 */
public interface ComputerPartVisitor {
    public void visit(Computer computer);
    public void visit(Mouse mouse);
    public void visit(Keyboard keyboard);
    public void visit(Monitor monitor);
}
