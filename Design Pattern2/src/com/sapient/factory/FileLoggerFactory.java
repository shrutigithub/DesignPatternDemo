package com.sapient.factory;

/**
 * Created by sbha63 on 5/20/2017.
 */
public class FileLoggerFactory extends LoggerFactory {
    String level="file";
    public FileLoggerFactory(String level) {
        super(level);
        System.out.println("File Logger");
    }
}
