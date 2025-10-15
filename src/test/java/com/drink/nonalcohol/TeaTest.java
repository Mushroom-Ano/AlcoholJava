package com.drink.nonalcohol;

import com.drink.alcohol.Alcohol;
import com.drink.alcohol.TooMuchAlcoholException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TeaTest {
    public Tea testTea;
    public Tea tooMuchCaffeine;

    @BeforeEach
    public void setup(){
        testTea = new Tea("testTea", 100f, 1.0f, 50, true);
    }

    @Test
    public void TooMuchCaffeineErrorCheck() {
        Throwable exception = assertThrows(TooMuchCaffeineException.class, () ->
                tooMuchCaffeine = new Tea("TooMuchTea", 100f, 1.0f, 110, true));
        assertEquals("Too much caffeine! 110.0%", exception.getMessage());
    }
}