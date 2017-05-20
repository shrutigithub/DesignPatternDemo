package com.sapient.factory;

import java.util.logging.Logger;

/**
 * Created by sbha63 on 5/20/2017.
 */
public class LoggerFactory {
    String level;
    public LoggerFactory(String level) {
        this.level=level;
    }

    public LoggerFactory createLogger( String level)
    {
        if(level=="console")
            return new ConsoleLoggerFactory(level);
        else if(level=="file") {
            return new FileLoggerFactory(level);
        }
return null;

    }

}
