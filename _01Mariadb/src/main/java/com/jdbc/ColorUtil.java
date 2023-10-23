package com.jdbc;

public class ColorUtil {
    public static final String PINK = "\u001B[38;5;206m";
    public static final String SKY_BLUE = "\u001B[34m";
    public static final String INDIGO_COLOR = "\u001B[38;5;68m";
    public static final String YELLOW = "\u001B[93m";
    public static final String PURPLE = "\u001B[35m";
    public static final String GREEN_COLOR = "\u001B[32m";
    public static final String RED_COLOR = "\u001B[31m";
    public static final String RESET_CODE = "\033[0m";

    public static String colorize(String text, String color) {
        return color + text + RESET_CODE;
    }
}
