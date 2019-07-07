/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package characterstream;

import java.io.*;
/**
 *
 * @author Sorabh86 <ssorabh.ssharma@gmail.com>
 */
public class Main {
    
    public static void main(String[] args) {
        try {
            
            OutputStreamWriter out = new OutputStreamWriter(new FileOutputStream("example4.txt")); 
            InputStreamReader in = new InputStreamReader(new FileInputStream("example4.txt")); 
            
            out.write("Hello Character Stream.");
            out.flush();
            
            out.close();
            
        } catch (Exception e) {
            System.out.println(e.toString());
        }
    }
}
