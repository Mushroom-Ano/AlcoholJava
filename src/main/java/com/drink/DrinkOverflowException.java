package com.drink;

public class DrinkOverflowException extends RuntimeException {
    private static String buildMessage(float overfill) {
        StringBuilder sb = new StringBuilder("DrinkOverflowException: ");
        sb.append("Overfilled drink by ").append(overfill).append("ml");
        return sb.toString();
    }

    public DrinkOverflowException(float overfill) {
        super(buildMessage(overfill));
    }
}