package com.sapient.com.sapient.abstractfactory;

/**
 * Created by sbha63 on 5/20/2017.
 */
public class ConferenceRoomFactory implements IRoomFactory {
    @Override
    public void createDoor() {
        System.out.println("Door for Conference Room");

    }

    @Override
    public void createFloor() {
        System.out.println("Floor for Conference Room");
    }


}

