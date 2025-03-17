package com.fossguru.ai.demo;

import org.apache.commons.text.WordUtils;

import java.util.stream.Stream;

public class StringToTittleCase {

    public static void main(String[] args) {
        String input = "Hello how are you doing?";

        //using Apache-common wordUtils
        String tittleCaseString = WordUtils.capitalizeFully(input);
        System.out.println(tittleCaseString);

        //without using library
        StringBuffer resultPlaceHolder = new StringBuffer(input.length());
        Stream.of(input.split(" ")).forEach(stringPart -> {
            if (stringPart.length() > 1) {
                resultPlaceHolder.append(stringPart.substring(0, 1).toUpperCase())
                        .append(stringPart.substring(1).toLowerCase());
            }
            else {
                resultPlaceHolder.append(stringPart.toUpperCase());
            }
            resultPlaceHolder.append(" ");
        });
        System.out.println(resultPlaceHolder.toString());
    }
}