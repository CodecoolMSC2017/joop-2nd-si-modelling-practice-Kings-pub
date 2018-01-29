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
        UserInterFace ui = new UserInterFace(buli);
        String newOrLoad;
        
        System.out.println("Welcome to Kings pub!Would you want to (load) a previous game or start a (new) one?");
        newOrLoad = userInput.nextLine().toLowerCase();
        if (newOrLoad.equals("load")) {
            buli = load(buli);
        }
        else {
            buli.createNewNight(buli);
        }

        while ( buli.getTime() < buli.getCounter().getBarista().getCloseingTime()) {
            ui.mainMenu(buli);
        }

    }
}