package com.drink;

public abstract class Drink implements IDrinkable{
    private String name;
    private float volume;
    private float price;
    private final float originalVolume;

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

    public void fillDrink(float newVolume) throws DrinkOverflowException {
        if (newVolume + getVolume() > getOriginalVolume()){
            throw new DrinkOverflowException(newVolume + getVolume() - getOriginalVolume());
        } else {
            setVolume(newVolume + getVolume());
        }
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

    public float getOriginalVolume() {
        return originalVolume;
    }
}
