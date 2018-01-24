package com.codecool;

public class Neutral extends Customer {
    private int friendlynessLevel;
    private String favouriteDrink;


    public Neutral(String name,int age,String allegience,int happinessLevel,int drunkness,int moneyAmount,String favouriteDrink) {
        super(name,age,allegience,happinessLevel,drunkness,moneyAmount);
        this.favouriteDrink = favouriteDrink;
        friendlynessLevel = 0;
    }
}