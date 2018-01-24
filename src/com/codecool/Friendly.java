package com.codecool;

public class Friendly extends Customer {
    private int funLevel;


    public Friendly(String name,int age,String allegience,int happinessLevel,int drunkness,int moneyAmount,int funLevel) {
        super(name,age,allegience,happinessLevel,drunkness,moneyAmount);
        this.funLevel = funLevel;
    }
}