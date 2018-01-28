package com.codecool;

public class Customer extends Person {
    private String allegience;
    private int happinessLevel;
    private int drunkness;
    private int moneyAmount;
    private String location;

    public Customer(String name,int age,String allegience,int happinessLevel,int drunkness,int moneyAmount) {
        super(name,age);
        this.allegience = allegience;
        this.happinessLevel = happinessLevel;
        this.drunkness = drunkness;
        this.moneyAmount = moneyAmount;
    }

    public Customer(String name,int age,int happinessLevel,int drunkness,int moneyAmount,String location) {
        super(name,age);
        this.happinessLevel = happinessLevel;
        this.drunkness = drunkness;
        this.moneyAmount = moneyAmount;
        this.location = location;
    }

    public int getHappinessLevel() {
        return happinessLevel;
    }

    public void setHappinessLevel(int happynessPoints) {
        happinessLevel += happynessPoints;
    }

    public int getDrunkness() {
        return drunkness;
    }

    public void setDrunkness(int alcohol) {
        drunkness += alcohol;
    }

    public int getMoneyAmount() {
        return moneyAmount;
    }

    public void setMoneyAmount(int moneyChange) {
        moneyAmount += moneyChange;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String newLocation) {
        location = newLocation;
    }
}