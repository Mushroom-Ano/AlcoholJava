package com.drink.nonalcohol;

import com.drink.Drink;
import com.drink.UndrinkableException;
import com.drink.alcohol.DrunkException;

public class Tea extends Drink {

    private final boolean drinkable;
    private float caffeine;

    public Tea(String name, float volume, float price, float caffeine, boolean drinkable) throws TooMuchCaffeineException{
        super(name, volume, price);
        this.drinkable = drinkable;
        this.caffeine = caffeine;

        if (caffeine > 100) {
            throw new TooMuchCaffeineException(caffeine);
        }
    }

    public float getCaffeine() {
        return caffeine;
    }

    public void setCaffeine(float caffeine) {
        this.caffeine = caffeine;
    }

    @Override
    public boolean isDrinkable(){
        return this.drinkable;
    }

    @Override
    public void toDrink () throws UndrinkableException {
        if (isDrinkable()) {
            System.out.println("Drink has been drunk");
            setVolume(0);
        }
        else {
            throw new UndrinkableException(getName());
        }
    }
}
