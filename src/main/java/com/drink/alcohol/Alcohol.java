package com.drink.alcohol;

import com.drink.Drink;

import java.util.Optional;

public class Alcohol extends Drink {

    private float alcoholPercent;
    private boolean isSparkling;
    private Optional<String> brand;

    public Alcohol(String name, float volume, float price, float alcoholPercent, boolean isSparkling) throws TooMuchAlcoholException, DrunkException{
        super(name, volume, price);

        if (alcoholPercent > 100) {
            throw new TooMuchAlcoholException("Too much alcohol, save yourself now!");
        }
        if (volume > 50 && alcoholPercent > 50) {
            throw new DrunkException("Control yourself, AA now!");
        }
        this.alcoholPercent = alcoholPercent;
        this.isSparkling = isSparkling;
        this.brand = Optional.empty();
    }

    public Alcohol(String name, float volume, float price, float alcoholPercent, boolean isSparkling, Optional<String> brand) throws TooMuchAlcoholException, DrunkException{
        this(name, volume, price, alcoholPercent, isSparkling);
        this.brand = brand;
    }

    @Override
    public void toDrink() {
        String formatted = String.format("Alcohol has been drunk! (%s ml)", getVolume());
        System.out.println(formatted);
        setVolume(0);
    }

    @Override
    public boolean isDrinkable() {
        return true;
    }

    public String getBrand() {
        return brand.orElse("No Brand");
    }

    public void setBrand(Optional<String> brand) {
        this.brand = brand;
    }
}
