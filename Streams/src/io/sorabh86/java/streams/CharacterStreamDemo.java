package io.sorabh86.java.streams;

import java.io.*;
/**
 *
 * @author Sorabh86 <ssorabh.ssharma@gmail.com>
 */
public class CharacterStreamDemo {
    
    public static void main(String[] args) {
        try {
            String path = "assets/streams/example4.txt";
            OutputStreamWriter out = new OutputStreamWriter(new FileOutputStream(path));
            out.write("Hello Character Stream.");
            out.write("\n");
            out.write("We love you");
            out.flush();
            out.close();

            InputStreamReader in = new InputStreamReader(new FileInputStream("assets/example4.txt"));
            System.out.println("Read: "+in.read());
            in.close();
            
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
