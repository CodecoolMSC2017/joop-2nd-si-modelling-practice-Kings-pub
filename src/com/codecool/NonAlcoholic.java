package com.codecool;

public class NonAlcoholic extends Drink {
    private int refreshmentLevel;

    public NonAlcoholic(String name,String type,int price,int refreshmentLevel) {
        super(name,type,price);
        this.refreshmentLevel = refreshmentLevel;
    }

    public int getRefreshmentLevel() {
        return refreshmentLevel;
    }
    
}