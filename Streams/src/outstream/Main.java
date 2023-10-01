/*
 * FileOutputStream
 */
package outstream;

import java.io.*;
/**
 *
 * @author Sorabh86 <ssorabh.ssharma@gmail.com>
 */
public class Main {
    
    public static void main(String[] args) {
        try {
            // second argument true if you want to append data
            FileOutputStream fileOutput = new FileOutputStream("example2.txt", true);
            
            char h = 'H';
            
            fileOutput.write(h);
            
            String str = "hello java network programming";
            
            fileOutput.write(str.getBytes());
            
            fileOutput.close();
        } catch (Exception ex) { 
            System.out.println(ex);
        }
    }
}
