package com.codecool;

import java.io.*;
import java.util.Random;

public class Place {
    String name;
    Friendly[] friendlies;
    Neutral[] neutrals;
    Hostile[] hostiles;
    Personnel barista;
    int capacity;
    Random random = new Random();


    Place(String name,int capacity,String friendlyCsvPath,String neutralCsvPath,String hostileCsvPath) {
        this.name = name;
        this.capacity = capacity;
        this.friendlies = new Friendly[0];
        this.neutrals = new Neutral[0];
        this.hostiles = new Hostile[0];
        addToCustomers(friendlyCsvPath);
        addToCustomers(neutralCsvPath);
        addToCustomers(hostileCsvPath);

    }

    Place(String name,String personnelCsvPath) {
        this.name = name;
        this.barista = new Personnel("",0,0);
        baristaFromCsv(barista,personnelCsvPath);
    }


    public void baristaFromCsv(Personnel barista,String csvFile) {
        String line = "";
        try(BufferedReader br = new BufferedReader(new FileReader("../data/" + csvFile))){
            int i = 0;
            int tonightsBarista = random.nextInt(4);
            while((line = br.readLine()) != null) {
                String[] person = line.split(",");
                if (i == tonightsBarista) {
                    barista.setName(person[0]);
                    barista.setAge(Integer.parseInt(person[1]));
                    barista.setCloseingTime(Integer.parseInt(person[2]));
                }
                i++;
            }
        }catch (IOException e) {
            System.out.println(" Exception error.File not found.");
            e.printStackTrace();

        }
    }

    public void addToCustomers(String csvFile) {
        String line = "";
        try(BufferedReader br = new BufferedReader(new FileReader("../data/" + csvFile))){
            while((line = br.readLine()) != null) {
                if (csvFile == "Friendly.csv") {
                    String[] person = line.split(",");
                    Friendly friendly = new Friendly(person[0],Integer.parseInt(person[1]), person[2],Integer.parseInt(person[3]),Integer.parseInt(person[4]),Integer.parseInt(person[5]),Integer.parseInt(person[6]));
                    addFriendlyToArray(friendly);
                }
                else if (csvFile == "Neutral.csv") {
                    String[] person = line.split(",");
                    Neutral neutral = new Neutral(person[0],Integer.parseInt(person[1]), person[2],Integer.parseInt(person[3]),Integer.parseInt(person[4]),Integer.parseInt(person[5]),person[6]);
                    addNeutralToArray(neutral);
                }
                else if (csvFile == "Hostile.csv") {
                    String[] person = line.split(",");
                    Hostile hostile = new Hostile(person[0],Integer.parseInt(person[1]), person[2],Integer.parseInt(person[3]),Integer.parseInt(person[4]),Integer.parseInt(person[5]),Integer.parseInt(person[6]));
                    addHostileToArray(hostile);
                }
            }
        }catch (IOException e) {
            System.out.println(" Exception error.File not found.");
            e.printStackTrace();

        }
    }
    public void addFriendlyToArray(Friendly friendly) {
        Friendly[] tempArray = new Friendly[friendlies.length + 1];
        for (int i = 0; i < friendlies.length; i++) {
            tempArray[i] = friendlies[i];
        }
        tempArray[tempArray.length - 1] = friendly;
        friendlies = tempArray;
    }
    
    public void addNeutralToArray(Neutral neutral) {
        Neutral[] tempArray = new Neutral[neutrals.length + 1];
        for (int i = 0; i < neutrals.length; i++) {
            tempArray[i] = neutrals[i];
        }
        tempArray[tempArray.length - 1] = neutral;
        neutrals = tempArray;
    }
    public void addHostileToArray(Hostile hostile) {
        Hostile[] tempArray = new Hostile[hostiles.length + 1];
        for (int i = 0; i < hostiles.length; i++) {
            tempArray[i] = hostiles[i];
        }
        tempArray[tempArray.length - 1] = hostile;
        hostiles = tempArray;
    }
}