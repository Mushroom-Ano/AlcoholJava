package com.drink;

import com.drink.alcohol.Alcohol;
import com.drink.nonalcohol.Tea;

import java.util.Optional;

public class Main {
    protected static Drink wine = new Alcohol("Moscato d'Asti", 750, 10f, 5.5f, false, Optional.of("Alasia"));
    protected static Drink beer = new Alcohol("Stella Artois", 400f, 8f, 4.8f, true, Optional.of("Stella"));
    protected static Drink whiskey = new Alcohol("Highland Park Capella", 750, 369f,40f, false,
        Optional.of("The Macallan"));

    protected static Alcohol tescoWhiskey = new Alcohol("PanyaWhisk", 1000, 0.99f, 50f, false);
    protected static Drink matcha = new Tea("Matcha Latte", 250, 2.55f, 60, false);

    public static void main(String[] args) {
        Drink[] allDrinks = new Drink[]{wine, beer, whiskey, matcha, tescoWhiskey};
        for (Drink drink : allDrinks) {
            try {
                System.out.println(drink.getName());
                drink.toDrink();
            } catch (Exception e) {
                System.out.println(e.getMessage());
                continue;
            } finally {
                System.out.println("Drink Volume: " + drink.getVolume());
            }
        }
        System.out.println(tescoWhiskey.getBrand());
        System.out.println("All Drinks Drank!");
    }
}