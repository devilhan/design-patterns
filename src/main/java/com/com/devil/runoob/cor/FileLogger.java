package com.com.devil.runoob.cor;

/**
 * @author Hanyanjiao
 * @date 2020/11/3
 */
public class FileLogger extends AbstractLogger {
    public FileLogger(int level){
        this.level = level;
    }

    @Override
    protected void write(String message) {
        System.out.println("File::Logger: "+message);
    }
}
