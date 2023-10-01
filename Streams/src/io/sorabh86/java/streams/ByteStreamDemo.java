package io.sorabh86.java.streams;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteStreamDemo {
    public static void main(String[] args) {
        FileInputStream in = null;
        FileOutputStream out = null;

        try {
            in = new FileInputStream("assets/streams/source.txt");
            out = new FileOutputStream("assets/streams/destination.txt");

            // read a byte at a time, if it reached to end, returns -1
            int content;
            while((content = in.read()) != -1) {
                out.write((byte) content);
            }

            in.close();
            out.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
