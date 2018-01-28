package com.codecool;

import java.io.*;
import java.util.*;

public class Main {
    private static Scanner userInput = new Scanner(System.in);

    public static void saveProgress(Night night) {
            night.save();
    }

    public static Night load(Night buli) {
        try {
            FileInputStream fileIn = new FileInputStream("../data/save.ser");
            ObjectInputStream in = new ObjectInputStream(fileIn);
            buli = (Night) in.readObject();
            in.close();
            fileIn.close();
            System.out.println("\n Night loaded");
            return buli;
        } catch (IOException e) {
            e.printStackTrace();
            System.exit(-1);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            System.exit(-1);
        }
        return null;
    }


    public static void main(String[] args) {
        
        Night buli = new Night();
        buli = load(buli);
        
        
        /*
        Night buli = new Night();
        Place mainRoom = new Place("Main room","Friendly.csv","Neutral.csv","Hostile.csv",buli);
        Place gameRoom = new Place("Gaming room","Friendly.csv","Neutral.csv","Hostile.csv",buli);
        Place smokeArea = new Place("Smoking area","Friendly.csv","Neutral.csv","Hostile.csv",buli);
        Place counter = new Place("Counter","Personnel.csv");
        buli.setMainRoom(mainRoom);
        buli.setGameRoom(gameRoom);
        buli.setSmokeArea(smokeArea);
        buli.setCounter(counter);
        */

        
        System.out.println(buli.getCounter().getBarista().getName());
        System.out.println("Cigi");
        System.out.println(buli.getSmokeArea().friendlies.length);
        System.out.println(buli.getSmokeArea().neutrals.length);
        System.out.println(buli.getSmokeArea().hostiles.length);
        System.out.println("Fő");
        System.out.println(buli.getMainRoom().friendlies.length);
        System.out.println(buli.getMainRoom().neutrals.length);
        System.out.println(buli.getMainRoom().hostiles.length);
        System.out.println("Kanape");
        System.out.println(buli.getGameRoom().friendlies.length);
        System.out.println(buli.getGameRoom().neutrals.length);
        System.out.println(buli.getGameRoom().hostiles.length);

        
        
        //saveMenu(buli);
        
        
        System.out.println(buli.getMainRoom().friendlies[0].getName());


    }
}