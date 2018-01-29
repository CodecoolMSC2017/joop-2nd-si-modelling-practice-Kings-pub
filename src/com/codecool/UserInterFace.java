package com.codecool;

import java.io.*;
import java.util.*;


public class UserInterFace{
    Scanner userInput = new Scanner(System.in);
    Night night;
    String choice;

    public UserInterFace(Night night) {
        this.night = night;
    }

    public void mainMenu(Night night) {
        
        System.out.println(night.getPlayer().getLocation());
        if (night.getPlayer().getLocation().equals("main room")) {
            System.out.println("(1)Watch soccer on TV (2)Interact with friendly (3)Befriend neutral (4)Chill (5)Go to");
            choice = userInput.nextLine().toLowerCase();
            if (choice.equals("1")) {
                System.out.println("under construction");
            }
            else if (choice.equals("2")) {
                System.out.println("under construction");
            }
            else if (choice.equals("3")) {
                System.out.println("under construction");
            }
            else if (choice.equals("4")) {
                System.out.println("under construction");
            }
            else if (choice.equals("5")) {
                System.out.println("Choose the location to go to: \n Counter, Game Room, Smoking Area, Toilet");
                choice = userInput.nextLine().toLowerCase();
                night.goTo(choice);
            }
            else if (choice.equals(":save")) {
                night.save();
            }
            else if (choice.equals(":create")) {
                System.out.println("under construction");
            }
            else if (choice.equals(":list")) {
                listObjects(night);
            }
            else if (choice.equals(":exit")) {
                night.save();
                System.exit(-1);
            }
            else if (choice.equals(":find")) {
                System.out.println("under construction");
            }
            

        }
        else if (night.getPlayer().getLocation().equals("counter")) {
            System.out.println("(1)Drink an alcoholic beverage (2) Drink a non-alcoholic beverage (3)Buy a scratch card (4)Go to");
            choice = userInput.nextLine().toLowerCase();
            if (choice.equals("1")) {
                System.out.println("under construction");
            }
            else if (choice.equals("2")) {
                System.out.println("under construction");
            }
            else if (choice.equals("3")) {
                System.out.println("under construction");
            }
            else if (choice.equals("4")) {
                System.out.println("Choose the location to go to: \n Main Room, Game Room, Smoking Area, Toilet");
                choice = userInput.nextLine().toLowerCase();
                night.goTo(choice);
            }
            else if (choice.equals(":save")) {
                night.save();
            }
            else if (choice.equals(":create")) {
                System.out.println("under construction");
            }
            else if (choice.equals(":list")) {
                listObjects(night);
            }
            else if (choice.equals(":exit")) {
                night.save();
                System.exit(-1);
            }
            else if (choice.equals(":find")) {
                System.out.println("under construction");
            }
        }
        else if (night.getPlayer().getLocation().equals("game room")) {
            System.out.println("(1)Play foosball (2)Play pool (3)Interact with friendly (4)Befriend neutral (5)Chill (6)Go to");
            choice = userInput.nextLine().toLowerCase();
            if (choice.equals("1")) {
                System.out.println("under construction");
            }
            else if (choice.equals("2")) {
                System.out.println("under construction");
            }
            else if (choice.equals("3")) {
                System.out.println("under construction");
            }
            else if (choice.equals("4")) {
                System.out.println("under construction");
            }
            else if (choice.equals("5")) {
                System.out.println("under construction");
            }
            else if (choice.equals("6")) {
                System.out.println("Choose the location to go to: \n Counter, Main Room, Smoking Area, Toilet");
                choice = userInput.nextLine().toLowerCase();
                night.goTo(choice);
            }
            else if (choice.equals(":save")) {
                night.save();
            }
            else if (choice.equals(":create")) {
                System.out.println("under construction");
            }
            else if (choice.equals(":list")) {
                listObjects(night);
            }
            else if (choice.equals(":exit")) {
                night.save();
                System.exit(-1);
            }
            else if (choice.equals(":find")) {
                System.out.println("under construction");
            }
        }
        else if (night.getPlayer().getLocation().equals("smoking area")) {
            System.out.println("(1)Smoke (2)Interact with friendly (3)Befriend neutral (4)Chill (5)Go to");
            choice = userInput.nextLine().toLowerCase();
            if (choice.equals("1")) {
                System.out.println("under construction");
            }
            else if (choice.equals("2")) {
                System.out.println("under construction");
            }
            else if (choice.equals("3")) {
                System.out.println("under construction");
            }
            else if (choice.equals("4")) {
                System.out.println("under construction");
            }
            else if (choice.equals("5")) {
                System.out.println("Choose the location to go to: \n Counter, Game Room, Main Room, Toilet");
                choice = userInput.nextLine().toLowerCase();
                night.goTo(choice);
            }
            else if (choice.equals(":save")) {
                night.save();
            }
            else if (choice.equals(":create")) {
                System.out.println("under construction");
            }
            else if (choice.equals(":list")) {
                listObjects(night);
            }
            else if (choice.equals(":exit")) {
                night.save();
                System.exit(-1);
            }
            else if (choice.equals(":find")) {
                System.out.println("under construction");
            }
        }
        else if (night.getPlayer().getLocation().equals("toilet")) {
            System.out.println("(1)Piss (2)Take a dump (3)Wash face (4)Go to");
            choice = userInput.nextLine().toLowerCase();
            if (choice.equals("1")) {
                System.out.println("under construction");
            }
            else if (choice.equals("2")) {
                System.out.println("under construction");
            }
            else if (choice.equals("3")) {
                System.out.println("under construction");
            }
            else if (choice.equals("4")) {
                System.out.println("Choose the location to go to: \n Counter, Game Room, Smoking Area, Main Room");
                choice = userInput.nextLine().toLowerCase();
                night.goTo(choice);
            }
            else if (choice.equals(":save")) {
                night.save();
            }
            else if (choice.equals(":create")) {
                System.out.println("under construction");
            }
            else if (choice.equals(":list")) {
                listObjects(night);
            }
            else if (choice.equals(":exit")) {
                night.save();
                System.exit(-1);
            }
            else if (choice.equals(":find")) {
                System.out.println("under construction");
            }
        }
    }

    public void listObjects(Night night) {
        listCounter(night);

        listMainRoomObjects(night);

        listGameRoomObjects(night);

        listSmokeAreaObjects(night);
        System.out.println("\n\n");
    }

    public void listMainRoomObjects(Night night) {
        System.out.println("\nMain room");
        System.out.println("\nFriendlies: ");
        for (int i = 0;i < night.getMainRoom().friendlies.length;i++) {
            System.out.print(night.getMainRoom().friendlies[i].getName() + "   ");
        }
        System.out.println("\nNeutrals: ");
        for (int i = 0;i < night.getMainRoom().neutrals.length;i++) {
            System.out.print(night.getMainRoom().neutrals[i].getName() + "   ");
        }
        System.out.println("\nHostiles: ");
        for (int i = 0;i < night.getMainRoom().hostiles.length;i++) {
            System.out.print(night.getMainRoom().hostiles[i].getName() + "   ");
        }
    }
    public void listGameRoomObjects(Night night) {
        System.out.println("\n\nGame room");
        System.out.println("\nFriendlies: ");
        for (int i = 0;i < night.getGameRoom().friendlies.length;i++) {
            System.out.print(night.getGameRoom().friendlies[i].getName() + "   ");
        }
        System.out.println("\nNeutrals: ");
        for (int i = 0;i < night.getGameRoom().neutrals.length;i++) {
            System.out.print(night.getGameRoom().neutrals[i].getName() + "   ");
        }
        System.out.println("\nHostiles: ");
        for (int i = 0;i < night.getGameRoom().hostiles.length;i++) {
            System.out.print(night.getGameRoom().hostiles[i].getName() + "   ");
        }
    }
    public void listSmokeAreaObjects(Night night) {
        System.out.println("\n\nSmoke area");
        System.out.println("\nFriendlies: ");
        for (int i = 0;i < night.getSmokeArea().friendlies.length;i++) {
            System.out.print(night.getSmokeArea().friendlies[i].getName() + "   ");
        }
        System.out.println("\nNeutrals: ");
        for (int i = 0;i < night.getSmokeArea().neutrals.length;i++) {
            System.out.print(night.getSmokeArea().neutrals[i].getName() + "   ");
        }
        System.out.println("\nHostiles: ");
        for (int i = 0;i < night.getSmokeArea().hostiles.length;i++) {
            System.out.print(night.getSmokeArea().hostiles[i].getName() + "   ");
        }
    }

    public void listCounter(Night night) {
        System.out.println("\nCounter");
        System.out.println("\nTonights barista:");
        System.out.println(night.getCounter().getBarista().getName());
    }

    
}