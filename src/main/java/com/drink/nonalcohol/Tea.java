package com.drink.nonalcohol;

import com.drink.Drink;
import com.drink.alcohol.DrunkException;

public class Tea extends Drink {

    private final boolean isDrinkable;
    private float caffeine;

    public Tea(String name, float volume, float price, float caffeine, boolean isDrinkable) throws TooMuchCaffeineException{
        super(name, volume, price);
        this.isDrinkable = isDrinkable;
        this.caffeine = caffeine;

        if (caffeine > 100) {
            throw new TooMuchCaffeineException(caffeine);
        }
    }

    @Override
    public boolean isDrinkable(){
        return this.isDrinkable;
    }
}
