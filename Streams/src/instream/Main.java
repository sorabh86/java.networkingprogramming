/*
 * FileInputstream
 * It is a subclass of InputStream
 */
package instream;

import java.io.*;
/**
 *
 * @author Sorabh86 <ssorabh.ssharma@gmail.com>
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            FileInputStream inputStream = new FileInputStream("example1.txt");
            
            int data = inputStream.read();
            while(data != -1) {
                System.out.print((char)data);
                data = inputStream.read();
            }
            
            inputStream.close();
        } catch (Exception ex) { 
            System.out.println(ex.toString());
        }
    }
    
}
