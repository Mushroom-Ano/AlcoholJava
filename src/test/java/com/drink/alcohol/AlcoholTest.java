package com.drink.alcohol;

import com.drink.alcohol.Alcohol;
import com.drink.alcohol.DrunkException;
import com.drink.alcohol.TooMuchAlcoholException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(AlcoholParameterResolver.class)
class AlcoholTest {
    public Alcohol testAlcohol;
    public Alcohol tooMuchAlcohol;

    @BeforeEach
    public void setup(){
        testAlcohol = new Alcohol("test", 100f, 1.0f, 25, true);
    }

    @Test
    @DisplayName("Testing Drink Functionality")
    public void toDrink() {
        testAlcohol.toDrink();
        assertEquals(0, testAlcohol.getVolume());
    }

    @ParameterizedTest
    @ValueSource(floats = {100, 400, 800, 1000})
    @DisplayName("Filling drink should fill the drink back to the original volume")
    public void fillDrink(float amount, Alcohol alcohols) {
        alcohols.
    }

    @Test
    public void AlcoholPercentageErrorCheck() {
        Throwable exception = assertThrows(TooMuchAlcoholException.class, () ->
                tooMuchAlcohol = new Alcohol("TooMuch", 100f, 1.0f, 110, true));
        assertEquals("Too much alcohol, save yourself now!", exception.getMessage());
    }

    @Test
    public void DrunkErrorCheck() {
        Throwable exception = assertThrows(DrunkException.class, () ->
                tooMuchAlcohol = new Alcohol("TooMuch", 60f, 1.0f, 60, true));
        assertEquals("Control yourself, AA now!", exception.getMessage());
    }
}