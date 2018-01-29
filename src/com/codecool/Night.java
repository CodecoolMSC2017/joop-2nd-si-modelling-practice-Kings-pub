package com.codecool;

import java.util.*;
import java.io.*;
import java.util.Random;

public class Night implements java.io.Serializable {
    private Customer player;
    private Place mainRoom;
    private Place gameRoom;
    private Place smokeArea;
    private Place counter;
    private int time;
    private ArrayList<String> guestList = new ArrayList<String>();


    public Night(Customer player,Place mainRoom,Place gameRoom,Place smokeArea,Place counter) {
        this();
        this.player = player;
        this.mainRoom = mainRoom;
        this.gameRoom = gameRoom;
        this.smokeArea = smokeArea;
        this.counter = counter;
        time = 1080;
    }

    public Night() {
        time = 1080;
    }
    




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

    public Place getMainRoom() {
        return mainRoom;
    }

    public void setGameRoom(Place gameRoom) {
        this.gameRoom = gameRoom;
    }

    public Place getGameRoom() {
        return gameRoom;
    }

    public void setSmokeArea(Place smokeArea) {
        this.smokeArea = smokeArea;
    }

    public Place getSmokeArea() {
        return smokeArea;
    }

    public void setCounter(Place counter) {
        this.counter = counter;
    }

    public Place getCounter() {
        return counter;
    }

    public Customer getPlayer() {
        return player;
    }

    public void setPlayer(Customer player) {
        this.player = player;
    }


    public void save() {
        try {
            FileOutputStream fileOut = new FileOutputStream("../data/save.ser");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(this);
            out.close();
            fileOut.close();
            System.out.println("\n Night saved\n");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }  
    

    public Night createNewNight(Night night) {
        Customer player = new Customer("Player",25,50,0,5000,"main room");
        Place mainRoom = new Place("Main room","Friendly.csv","Neutral.csv","Hostile.csv",night);
        Place gameRoom = new Place("Gaming room","Friendly.csv","Neutral.csv","Hostile.csv",night);
        Place smokeArea = new Place("Smoking area","Friendly.csv","Neutral.csv","Hostile.csv",night);
        Place counter = new Place("Counter","Personnel.csv");
        night.setPlayer(player);
        night.setMainRoom(mainRoom);
        night.setGameRoom(gameRoom);
        night.setSmokeArea(smokeArea);
        night.setCounter(counter);
        return night;
    }

    public void goTo(String location) {
        getPlayer().setLocation(location);
    }
}