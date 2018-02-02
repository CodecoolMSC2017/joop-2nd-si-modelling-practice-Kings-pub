package com.codecool;

public class Alcoholic extends Drink {
    private int alcoholVolume;
    private int blackOutChance;

    public Alcoholic(String name,String type,int price,int alcoholVolume,int blackOutChance) {
        super(name,type,price);
        this.alcoholVolume = alcoholVolume;
        this.blackOutChance = blackOutChance;
    }

    public int getAlcoholVolume() {
        return alcoholVolume;
    }

    public int getBlackOutChance() {
        return blackOutChance;
    }
}