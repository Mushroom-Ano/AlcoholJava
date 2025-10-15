package com.drink;

public abstract class Drink implements IDrinkable{
    private String name;
    private float volume;
    private float price;

    private static float originalVolume;

    public Drink(String name, float volume, float price) {
        this.name = name;
        this.volume = volume;
        this.price = price;
        this.originalVolume = volume;
    }

    public void toDrink() {
        System.out.println("Drink has been drunk");
        setVolume(0);
    }

    public void fillDrink(int originalVolume, int newVolume) {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getVolume() {
        return volume;
    }

    public void setVolume(float volume) {
        this.volume = volume;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }
}
