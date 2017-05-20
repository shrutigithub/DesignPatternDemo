package com.sapient.factory;

/**
 * Created by sbha63 on 5/20/2017.
 */
public class ConsoleLoggerFactory extends LoggerFactory {
    String level="console";
    public ConsoleLoggerFactory(String level) {
        super(level);
        System.out.println("Console Logger");
    }
}
