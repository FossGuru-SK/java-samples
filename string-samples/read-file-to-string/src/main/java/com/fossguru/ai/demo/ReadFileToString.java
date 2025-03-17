package com.fossguru.ai.demo;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.stream.Stream;

public class ReadFileToString {
    public static void main(String[] args) {

        //Using Java 11 readString(path)
        Path path = Path.of("/Users/sujitsuryakantkarne/Desktop/Jarvis/Learning/Generative AI/java-samples/string-samples/read-file-to-string/src/main/resources/demo.txt");
        String content;
        try {
            content = Files.readString(path);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        System.out.println(content);

        //Using java 8 - Files.lines()
        Path filePath = Path.of("/Users/sujitsuryakantkarne/Desktop/Jarvis/Learning/Generative AI/java-samples/string-samples/read-file-to-string/src/main/resources/demo.txt");
        StringBuilder contentBuilder = new StringBuilder();
        try (Stream<String> stream = Files.lines(filePath)){
            stream.forEach(s -> contentBuilder.append(s).append("\n"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        System.out.println(contentBuilder);

        //Using java 7 Files.readAllBytes()
        Path filePathGiven = Path.of("/Users/sujitsuryakantkarne/Desktop/Jarvis/Learning/Generative AI/java-samples/string-samples/read-file-to-string/src/main/resources/demo.txt");
        String fileContent = "";

        try {
            byte[] bytes = Files.readAllBytes(filePathGiven);
            fileContent = new String(bytes);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        System.out.println(fileContent);
    }
}