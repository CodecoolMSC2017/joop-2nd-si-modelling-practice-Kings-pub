package com.codecool;

public class Hostile extends Customer {
    private int annoyingLevel;


    public Hostile(String name,int age,String allegience,int happinessLevel,int drunkness,int moneyAmount,int annoyingLevel) {
        super(name,age,allegience,happinessLevel,drunkness,moneyAmount);
        this.annoyingLevel = annoyingLevel;
    }

    public int getAnnoyingLevel() {
        return annoyingLevel;
    }
}