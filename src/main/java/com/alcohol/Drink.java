package com.alcohol;

public abstract class Drink implements IDrinkable{
    private String name;
    private float volume;
    private float price;

    public Drink(String name, float volume, float price) {
        this.name = name;
        this.volume = volume;
        this.price = price;
    }

    public void toDrink() {
        System.out.println("Drink has been drunk");
        setVolume(0);
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
