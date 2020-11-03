package com.com.devil.runoob.proxy;


/**
 * @author Hanyanjiao
 * @date 2020/11/3
 */
public class RealImage implements Image {
    private String fileName;

    public RealImage(String fileName){
        this.fileName = fileName;
        loadFromDisk(fileName);
    }



    private void loadFromDisk(String fileName) {
        System.out.println("Loading "+fileName);
    }

    @Override
    public void display() {
        System.out.println("Displaying "+fileName);
    }
}
