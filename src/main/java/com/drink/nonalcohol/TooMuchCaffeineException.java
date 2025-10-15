package com.drink.nonalcohol;

public class TooMuchCaffeineException extends RuntimeException {
    private static String buildMessage(float caffeine) {
        StringBuilder sb = new StringBuilder("Too much caffeine!");
        sb.append(" ").append(caffeine).append("%");
        return sb.toString();
    }

    public TooMuchCaffeineException(float caffeine) {
        super(buildMessage(caffeine));
    }
}
