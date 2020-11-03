package com.com.devil.runoob.iterator;

/**
 * @author Hanyanjiao
 * @date 2020/11/3
 */
public class IteratorPatternDemo {
    public static void main(String[] args){
        NameRepository nameRepository = new NameRepository();

        for (Iterator iterator = nameRepository.getIterator();iterator.hasNext();){
            String name = (String) iterator.next();
            System.out.println("Name is "+name);
        }
    }
}
