package com.codecool;

public class Main {


    public static void main(String[] args) {
        Night buli = new Night();
        Place mainRoom = new Place("Main room","Friendly.csv","Neutral.csv","Hostile.csv",buli);
        Place gameRoom = new Place("Gaming room","Friendly.csv","Neutral.csv","Hostile.csv",buli);
        Place smokeArea = new Place("Smoking area","Friendly.csv","Neutral.csv","Hostile.csv",buli);
        Place counter = new Place("Counter","Personnel.csv");
        buli.setMainRoom(mainRoom);
        buli.setGameRoom(gameRoom);
        buli.setSmokeArea(smokeArea);
        //Night buli = new Night(mainRoom,gameRoom,smokeArea,counter);

        System.out.println(counter.barista.getName());
        System.out.println("Cigi");
        System.out.println(smokeArea.friendlies.length);
        System.out.println(smokeArea.neutrals.length);
        System.out.println(smokeArea.hostiles.length);
        System.out.println("Fő");
        System.out.println(mainRoom.friendlies.length);
        System.out.println(mainRoom.neutrals.length);
        System.out.println(mainRoom.hostiles.length);
        System.out.println("Kanape");
        System.out.println(gameRoom.friendlies.length);
        System.out.println(gameRoom.neutrals.length);
        System.out.println(gameRoom.hostiles.length);

        System.out.println(buli.getGuestList());

    }
}