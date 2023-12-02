package io.aoc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.stream.Collectors;

public class FileProvider {


    public static String readFileFromResources(String filename) {
        try {
            // Get the input stream for the file
            InputStream inputStream = FileProvider.class.getClassLoader().getResourceAsStream(filename);

            if (inputStream != null) {
                // Use BufferedReader to read the file efficiently
                try (BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream))) {
                    // Use Java 8 Streams to collect lines into a single string
                    return reader.lines().collect(Collectors.joining(System.lineSeparator()));
                }
            } else {
                System.err.println("File not found: " + filename);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return null; // Return null if an error occurs
    }
}
