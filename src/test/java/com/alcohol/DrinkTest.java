package com.alcohol;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DrinkTest {
    public Alcohol testAlcohol;

    @BeforeEach
    public void setup(){
        testAlcohol = new Alcohol("test", 100f, 1.0f, 25, true);
    }

    @Test
    public void toDrink() {
        testAlcohol.toDrink();
        assertEquals(0, testAlcohol.getVolume());
    }

    @Test
    void getName() {
    }

    @Test
    void setName() {
    }

    @Test
    void getVolume() {
    }

    @Test
    void setVolume() {
    }

    @Test
    void getPrice() {
    }

    @Test
    void setPrice() {
    }
}