package com.sapient.factory;

import java.util.Scanner;
import java.util.logging.Logger;

/**
 * Created by sbha63 on 5/20/2017.
 */
public class LoggerFactoryDemo {
    public static void main(String[] args) {
      String level="console";
      LoggerFactory loggerFactory=new LoggerFactory(level);
      loggerFactory.createLogger(level);

    }
}
