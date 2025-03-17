package com.fossguru.ai.demo;

public class StringAlignment {
    public static void main(String[] args) {

        String input = "Sujit";
        int width = 10;
        int padding = (width - input.length())/2;

        String leftAlignedString = String.format("%-" + width + "s", input);
        String rightAlignedString = String.format("%" + width + "s", input);
        String centeredString = String.format("%" + (padding + input.length()) + "s", input);
        System.out.println(leftAlignedString);
        System.out.println(rightAlignedString);
        System.out.println(centeredString);
    }
}