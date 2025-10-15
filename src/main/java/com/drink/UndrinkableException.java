package com.drink;

public class UndrinkableException extends RuntimeException {
    private static String buildMessage(String name) {
        StringBuilder sb = new StringBuilder("Can't drink");
        sb.append(" ").append(name).append("!");
        return sb.toString();
    }

    public UndrinkableException(String name) {
        super(buildMessage(name));
    }
}
