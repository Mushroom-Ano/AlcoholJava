package com.drink.nonalcohol;

import com.drink.UndrinkableException;
import com.drink.alcohol.Alcohol;
import com.drink.alcohol.TooMuchAlcoholException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TeaTest {
    public Tea testTea;
    public Tea tooMuchCaffeine;
    public Tea matcha;

    @BeforeEach
    public void setup(){
        testTea = new Tea("testTea", 100f, 1.0f, 50, true);
    }

    @Test
    public void toDrink() {
        testTea.toDrink();
        assertEquals(0, testTea.getVolume());
    }

    @Test
    public void notDrinkable() {
        matcha = new Tea("Matcha", 100f, 1.0f, 10, false);
        Throwable exception = assertThrows(UndrinkableException.class, () -> matcha.toDrink());
        assertEquals("Can't drink Matcha!", exception.getMessage());
    }

    @Test
    public void TooMuchCaffeineErrorCheck() {
        Throwable exception = assertThrows(TooMuchCaffeineException.class, () ->
                tooMuchCaffeine = new Tea("TooMuchTea", 100f, 1.0f, 110, true));
        assertEquals("Too much caffeine! 110.0%", exception.getMessage());
    }
}