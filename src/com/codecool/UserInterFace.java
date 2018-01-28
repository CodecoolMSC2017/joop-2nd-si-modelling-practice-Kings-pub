package com.codecool;

import java.io.*;


public class UserInterFace implements java.io.Serializable{
    Night night;

    public UserInterFace(Night night) {
        this.night = night;
    }

    public void displayLocationMenu() {
        //System.out.println(night.getPlayer().getLocation());
        if (night.getPlayer().getLocation().equals("Main Room")) {
            System.out.println("(1)Watch soccer on TV (2)Interact with friendly (3)Befriend neutral (4)Chill (5)Go to");
        }
        else if (night.getPlayer().getLocation().equals("Counter")) {
            System.out.println("(1)Drink an alcoholic beverage (2) Drink a non-alcoholic beverage (3)Buy a scratch card (4)Go to");
        }
        else if (night.getPlayer().getLocation().equals("Game Room")) {
            System.out.println("(1)Play foosball (2)Play pool (3)Interact with friendly (4)Befriend neutral (5)Chill (6)Go to");
        }
        else if (night.getPlayer().getLocation().equals("Smoking Area")) {
            System.out.println("(1)Smoke (2)Interact with friendly (3)Befriend neutral (4)Chill (5)Go to");
        }
        else if (night.getPlayer().getLocation().equals("Toilet")) {
            System.out.println("(1)Piss (2)Take a dump (3)Wash face (4)Go to");
        }
    }
}