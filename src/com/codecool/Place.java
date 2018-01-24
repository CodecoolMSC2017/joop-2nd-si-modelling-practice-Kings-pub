package com.codecool;

import java.io.*;
import java.util.Random;

public class Place {
    String name;
    Customer[] customers;
    Personnel barista;
    int capacity;
    Random random = new Random();


    Place(String name,int capacity,String friendlyCsvPath,String neutralCsvPath,String hostileCsvPath) {
        this.name = name;
        this.capacity = capacity;
        this.customers = new Customer[0];
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
            int tonightsBarista = random.nextInt(3);
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
        Customer[] tempArray = new Friendly[customers.length + 1];
        for (int i = 0; i < customers.length; i++) {
            tempArray[i] = customers[i];
        }
        tempArray[tempArray.length - 1] = friendly;
        customers = tempArray;
    }
    public void addNeutralToArray(Neutral neutral) {
        Customer[] tempArray = new Neutral[customers.length + 1];
        for (int i = 0; i < customers.length; i++) {
            tempArray[i] = customers[i];
        }
        tempArray[tempArray.length - 1] = neutral;
        customers = tempArray;
    }
    public void addHostileToArray(Hostile hostile) {
        Customer[] tempArray = new Hostile[customers.length + 1];
        for (int i = 0; i < customers.length; i++) {
            tempArray[i] = customers[i];
        }
        tempArray[tempArray.length - 1] = hostile;
        customers = tempArray;
    }
}