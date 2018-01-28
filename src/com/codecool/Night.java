package com.codecool;

import java.io.*;
import java.util.Random;

public class Night {
    Place mainRoom;
    Place gameRoom;
    Place smokeArea;
    Place counter;
    private int time;
    int maxCustomers = 20;

    public Night(Place mainRoom,Place gameRoom,Place smokeArea,Place counter) {
        this.mainRoom = mainRoom;
        this.gameRoom = gameRoom;
        this.smokeArea = smokeArea;
        this.counter = counter;
        time = 1080;
    }


    public void setTime(int timeUsed) {
        time += timeUsed;
    }

    public int getTime() {
        return time;
    }



}