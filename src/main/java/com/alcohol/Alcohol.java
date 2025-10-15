package com.alcohol;

public class Alcohol extends Drink {

    private float alcoholPercent;
    private boolean isSparkling;
    private String brand;

    public Alcohol(String name, float volume, float price, float alcoholPercent, boolean isSparkling, String brand) {
        super(name, volume, price);
        this.alcoholPercent = alcoholPercent;
        this.isSparkling = isSparkling;
        this.brand = brand;
    }

    public Alcohol(String name, float volume, float price, float alcoholPercent, boolean isSparkling) {
        super(name, volume, price);
        this.alcoholPercent = alcoholPercent;
        this.isSparkling = isSparkling;
    }

    @Override
    public void toDrink() {
        System.out.println("Alcohol has been drunk!");
        setVolume(0);
    }

    @Override
    public boolean isDrinkable() {
        return true;
    }
}
