package com.codecool;

public class Main {

    public static void main(String[] args) {
        Place mainRoom = new Place("Main room",20,"Friendly.csv","Neutral.csv","Hostile.csv");
        Place gameRoom = new Place("Gaming room",20,"Friendly.csv","Neutral.csv","Hostile.csv");
        Place smokeArea = new Place("Smoking area",20,"Friendly.csv","Neutral.csv","Hostile.csv");
        Place counter = new Place("Counter","Personnel.csv");
        Night buli = new Night(mainRoom,gameRoom,smokeArea,counter);

        System.out.println(smokeArea.friendlies.length);
        System.out.println(smokeArea.neutrals.length);
        System.out.println(smokeArea.hostiles.length);
        System.out.println(counter.barista.getName());

    }
}