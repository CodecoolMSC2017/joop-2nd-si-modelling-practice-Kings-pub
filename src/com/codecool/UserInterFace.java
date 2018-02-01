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
        
        if (night.getPlayer().getLocation().equals("main room")) {
            listMainRoomObjects(night);
            System.out.println("\n\n(1)Watch soccer on TV (2)Interact with friendly (3)Befriend neutral (4)Chill (5)Go to");
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
                System.out.println("\nChoose the location to go to: \n Counter, Game Room, Smoking Area, Toilet\nPress anything else to return.");
                choice = userInput.nextLine().toLowerCase();
                night.goTo(choice);
            }
            else if (choice.equals(":save")) {
                night.save();
            }
            else if (choice.equals(":create")) {
                System.out.println("Enter your friends name: ");
                String friendName = userInput.nextLine();
                if (!night.getGuestList().contains(friendName)) {
                    Friendly friend = new Friendly(friendName,25,"friendly",50,0,5000,25);
                    night.getMainRoom().addFriendlyToArray(friend);
                    System.out.println("Your friend arrived to the pub!");
                }
                else {
                    System.out.println("Somebody is already in the pub with this name. Give your friend a different nickname.");
                }
            }
            else if (choice.equals(":list")) {
                listObjects(night);
            }
            else if (choice.equals(":exit")) {
                night.save();
                System.exit(-1);
            }
            else if (choice.equals(":find")) {
                String customer = userInput.nextLine();
                Customer found = night.getCustomerByName(customer);
                
                if (found != null) {
                    System.out.println("\n\nCustomer found!");
                    System.out.println("\tName: " + found.getName());
                    System.out.println("\tAge: " + found.getAge());
                    System.out.println("\tAllegience: " + found.getAllegience());
                    System.out.println("\tDrunkness: " + found.getDrunkness());
                    System.out.println("\tHappiness: " + found.getHappinessLevel());
                    
                }
                else {
                    System.out.println("Sorry, " + customer + " wasn't found tonight.");
                }
            }
            

        }
        else if (night.getPlayer().getLocation().equals("counter")) {
            listCounter(night);
            System.out.println("\n\n(1)Drink an alcoholic beverage (2) Drink a non-alcoholic beverage (3)Buy a scratch card (4)Go to");
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
                System.out.println("\nChoose the location to go to: \n Main Room, Game Room, Smoking Area, Toilet\nPress anything else to return.");
                choice = userInput.nextLine().toLowerCase();
                night.goTo(choice);
            }
            else if (choice.equals(":save")) {
                night.save();
            }
            else if (choice.equals(":create")) {
                System.out.println("Enter your friends name: ");
                String friendName = userInput.nextLine();
                if (!night.getGuestList().contains(friendName)) {
                    Friendly friend = new Friendly(friendName,25,"friendly",50,0,5000,25);
                    night.getMainRoom().addFriendlyToArray(friend);
                    System.out.println("Your friend arrived to the pub!");
                }
                else {
                    System.out.println("Somebody is already in the pub with this name. Give your friend a different nickname.");
                }
            }
            else if (choice.equals(":list")) {
                listObjects(night);
            }
            else if (choice.equals(":exit")) {
                night.save();
                System.exit(-1);
            }
            else if (choice.equals(":find")) {
                String customer = userInput.nextLine();
                Customer found = night.getCustomerByName(customer);
                
                if (found != null) {
                    System.out.println("\n\nCustomer found!");
                    System.out.println("\tName: " + found.getName());
                    System.out.println("\tAge: " + found.getAge());
                    System.out.println("\tAllegience: " + found.getAllegience());
                    System.out.println("\tDrunkness: " + found.getDrunkness());
                    System.out.println("\tHappiness: " + found.getHappinessLevel());
                    
                }
                else {
                    System.out.println("Sorry, " + customer + " wasn't found tonight.");
                }
            }
        }
        else if (night.getPlayer().getLocation().equals("game room")) {
            listGameRoomObjects(night);
            System.out.println("\n\n(1)Play foosball (2)Play pool (3)Interact with friendly (4)Befriend neutral (5)Chill (6)Go to");
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
                System.out.println("\nChoose the location to go to: \n Counter, Main Room, Smoking Area, Toilet\nPress anything else to return.");
                choice = userInput.nextLine().toLowerCase();
                night.goTo(choice);
            }
            else if (choice.equals(":save")) {
                night.save();
            }
            else if (choice.equals(":create")) {
                System.out.println("Enter your friends name: ");
                String friendName = userInput.nextLine();
                if (!night.getGuestList().contains(friendName)) {
                    Friendly friend = new Friendly(friendName,25,"friendly",50,0,5000,25);
                    night.getGameRoom().addFriendlyToArray(friend);
                    System.out.println("Your friend arrived to the pub!");
                }
                else {
                    System.out.println("Somebody is already in the pub with this name. Give your friend a different nickname.");
                }
            }
            else if (choice.equals(":list")) {
                listObjects(night);
            }
            else if (choice.equals(":exit")) {
                night.save();
                System.exit(-1);
            }
            else if (choice.equals(":find")) {
                String customer = userInput.nextLine();
                Customer found = night.getCustomerByName(customer);
                
                if (found != null) {
                    System.out.println("\n\nCustomer found!");
                    System.out.println("\tName: " + found.getName());
                    System.out.println("\tAge: " + found.getAge());
                    System.out.println("\tAllegience: " + found.getAllegience());
                    System.out.println("\tDrunkness: " + found.getDrunkness());
                    System.out.println("\tHappiness: " + found.getHappinessLevel());
                    
                }
                else {
                    System.out.println("Sorry, " + customer + " wasn't found tonight.");
                }
            }
        }
        else if (night.getPlayer().getLocation().equals("smoking area")) {
            listSmokeAreaObjects(night);
            System.out.println("\n\n(1)Smoke (2)Interact with friendly (3)Befriend neutral (4)Chill (5)Go to");
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
                System.out.println("\nChoose the location to go to: \n Counter, Game Room, Main Room, Toilet\nPress anything else to return.");
                choice = userInput.nextLine().toLowerCase();
                night.goTo(choice);
            }
            else if (choice.equals(":save")) {
                night.save();
            }
            else if (choice.equals(":create")) {
                System.out.println("Enter your friends name: ");
                String friendName = userInput.nextLine();
                if (!night.getGuestList().contains(friendName)) {
                    Friendly friend = new Friendly(friendName,25,"friendly",50,0,5000,25);
                    night.getSmokeArea().addFriendlyToArray(friend);
                    System.out.println("Your friend arrived to the pub!");
                }
                else {
                    System.out.println("Somebody is already in the pub with this name. Give your friend a different nickname.");
                }
            }
            else if (choice.equals(":list")) {
                listObjects(night);
            }
            else if (choice.equals(":exit")) {
                night.save();
                System.exit(-1);
            }
            else if (choice.equals(":find")) {
                String customer = userInput.nextLine();
                Customer found = night.getCustomerByName(customer);
                
                if (found != null) {
                    System.out.println("\n\nCustomer found!");
                    System.out.println("\tName: " + found.getName());
                    System.out.println("\tAge: " + found.getAge());
                    System.out.println("\tAllegience: " + found.getAllegience());
                    System.out.println("\tDrunkness: " + found.getDrunkness());
                    System.out.println("\tHappiness: " + found.getHappinessLevel());
                    
                }
                else {
                    System.out.println("Sorry, " + customer + " wasn't found tonight.");
                }
            }
        }
        else if (night.getPlayer().getLocation().equals("toilet")) {
            System.out.println("\nToilet");
            System.out.println("(1)Piss (2)Take a dump (3)Wash face (4)Go to");
            choice = userInput.nextLine().toLowerCase();
            if (choice.equals("1")) {
                System.out.println("Ahh,what a relief.");
                System.out.print("\nYour drunkness lowered from " + night.getPlayer().getDrunkness());
                if (night.getPlayer().getDrunkness() < 5) {
                    night.getPlayer().setDrunknessToZero();
                }
                else {
                    night.getPlayer().setDrunkness(-5);
                }
                System.out.print(" to " + night.getPlayer().getDrunkness() + "\n");
            }
            else if (choice.equals("2")) {
                System.out.println("You are brave.....or just crazy?\n" +
                "Congrats,you got 'kétoldali seggtifusz' from the pubs infected toilet.\n" +
                "You should see a doctor soon!");
                night.getPlayer().setHappinessLevel(-10);
                System.out.println("\nYour happyness lowered from " + (night.getPlayer().getHappinessLevel()+10) + " to " + 
                night.getPlayer().getHappinessLevel() + "\n");
            }
            else if (choice.equals("3")) {
                System.out.print("\nYour drunkness lowered from " + night.getPlayer().getDrunkness());
                if (night.getPlayer().getDrunkness() < 10) {
                    night.getPlayer().setDrunknessToZero();
                }
                else {
                    night.getPlayer().setDrunkness(-10);
                }
                System.out.print(" to " + night.getPlayer().getDrunkness() + "\n");
            }
            else if (choice.equals("4")) {
                System.out.println("\nChoose the location to go to: \n Counter, Game Room, Smoking Area, Main Room\nPress anything else to return.");
                choice = userInput.nextLine().toLowerCase();
                night.goTo(choice);
            }
            else if (choice.equals(":save")) {
                night.save();
            }
            else if (choice.equals(":create")) {
                System.out.println("\n\nMan,you are weird,inviting your friend to the toilet...");
                System.out.println("Whatever... Enter your friends name: ");
                String friendName = userInput.nextLine();
                if (!night.getGuestList().contains(friendName)) {
                    Friendly friend = new Friendly(friendName,25,"friendly",50,0,5000,25);
                    night.getMainRoom().addFriendlyToArray(friend);
                    System.out.println("Your friend arrived to the pub!");
                }
                else {
                    System.out.println("Somebody is already in the pub with this name. Give your friend a different nickname.");
                }
            }
            else if (choice.equals(":list")) {
                listObjects(night);
            }
            else if (choice.equals(":exit")) {
                night.save();
                System.exit(-1);
            }
            else if (choice.equals(":find")) {
                String customer = userInput.nextLine();
                Customer found = night.getCustomerByName(customer);
                
                if (found != null) {
                    System.out.println("\n\nCustomer found!");
                    System.out.println("\tName: " + found.getName());
                    System.out.println("\tAge: " + found.getAge());
                    System.out.println("\tAllegience: " + found.getAllegience());
                    System.out.println("\tDrunkness: " + found.getDrunkness());
                    System.out.println("\tHappiness: " + found.getHappinessLevel());
                    
                }
                else {
                    System.out.println("Sorry, " + customer + " wasn't found tonight.");
                }
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