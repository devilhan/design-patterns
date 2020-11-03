package com.com.devil.runoob.cor;

/**
 * @author Hanyanjiao
 * @date 2020/11/3
 */
public class ChainPatternDemo {

    private static AbstractLogger getChainOfLoggers(){
        AbstractLogger errorLogger = new ErrorLogger(AbstractLogger.ERROR);
        AbstractLogger fileLogger = new FileLogger(AbstractLogger.DEBUG);
        AbstractLogger consoleLogger = new ConsoleLogger(AbstractLogger.INFO);

        errorLogger.setNextLogger(fileLogger);
        fileLogger.setNextLogger(consoleLogger);
        return errorLogger;
    }

    public static void main(String[] args){
        AbstractLogger logger = getChainOfLoggers();
        logger.logMessage(AbstractLogger.INFO,"This is an information.");

        logger.logMessage(AbstractLogger.DEBUG,"This is a debug level information.");

        logger.logMessage(AbstractLogger.ERROR,"This is an error information.");
    }
}
