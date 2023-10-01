package io.sorabh86.java.streams;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CharacterStreamDemo2 {
    public static void main(String[] args) {
        FileReader reader = null;
        FileWriter writer = null;

        try {
            reader = new FileReader("assets/streams/source.txt");
            writer = new FileWriter("assets/streams/dest.txt");

            // Read file character by character
            int content;
            while((content = reader.read()) != -1)
                writer.append((char) content);

            reader.close();
            writer.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
