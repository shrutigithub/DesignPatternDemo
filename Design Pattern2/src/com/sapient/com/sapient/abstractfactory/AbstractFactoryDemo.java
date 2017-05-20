package com.sapient.com.sapient.abstractfactory;

/**
 * Created by sbha63 on 5/20/2017.
 */
public class AbstractFactoryDemo {

    private IFactory factory;

    public AbstractFactoryDemo(IFactory factory) {
        this.factory = factory;
    }

    public void createRoom()
    {
        IRoomFactory roomFactory=factory.getFactory();
        roomFactory.createDoor();
        roomFactory.createDoor();
    }
}
