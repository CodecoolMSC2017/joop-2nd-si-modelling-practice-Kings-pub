package com.codecool;

import java.util.*;
import java.io.*;
import java.util.Random;

public class Night {
    Place mainRoom;
    Place gameRoom;
    Place smokeArea;
    Place counter;
    private int time;
    ArrayList<String> guestList = new ArrayList<String>();


    public Night(Place mainRoom,Place gameRoom,Place smokeArea,Place counter) {
        this.mainRoom = mainRoom;
        this.gameRoom = gameRoom;
        this.smokeArea = smokeArea;
        this.counter = counter;
        time = 1080;
    }

    public Night() {}
    




    public void setTime(int timeUsed) {
        time += timeUsed;
    }

    public int getTime() {
        return time;
    }

    public void setGuestList(String guest) {
        guestList.add(guest);
    }

    public ArrayList getGuestList() {
        return guestList;
    }

    public void setMainRoom(Place mainRoom) {
        this.mainRoom = mainRoom;
    }
    public void setGameRoom(Place gameRoom) {
        this.gameRoom = gameRoom;
    }
    public void setSmokeArea(Place smokeArea) {
        this.smokeArea = smokeArea;
    }
}