package com.com.devil.runoob.visitor;

/**
 * @author Hanyanjiao
 * @date 2020/11/4
 */
public class VisitorPatternDemo {
    public static void main(String[] args){
        ComputerPart computer = new Computer();
        computer.accept(new ComputerPartDisplayVisitor());
    }
}
