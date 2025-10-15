package com.alcohol;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AlcoholTest {
    public Alcohol testAlcohol;
    public Alcohol tooMuchAlcohol;

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
    public void AlcoholPercentageErrorCheck() {
        Throwable exception = assertThrows(TooMuchAlcoholException.class, () ->
                tooMuchAlcohol = new Alcohol("TooMuch", 100f, 1.0f, 110, true));
        assertEquals("Too much alcohol, save yourself now!", exception.getMessage());
    }
}