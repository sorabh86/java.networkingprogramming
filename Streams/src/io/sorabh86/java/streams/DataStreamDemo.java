/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io.sorabh86.java.streams;

import java.io.*;
/**
 *
 * @author Sorabh86 <ssorabh.ssharma@gmail.com>
 */
public class DataStreamDemo {

    public static void main(String[] args) {
        
        File file = new File("example3.txt");
        
        if(file.exists()) {
            System.out.println("file already exists "+file.getName());
        } else {
            try {
                if(file.createNewFile()) {
                    System.out.println("File was created.");
                    System.out.println("File path: "+file.getAbsolutePath());
                } else {
                    System.out.println("File cannot be created");
                }
            } catch (Exception ex) {
                System.out.println(ex);
            }
        }
        
        try {
            DataOutputStream out = new DataOutputStream(new FileOutputStream(file.getName()));
            DataInputStream in = new DataInputStream(new FileInputStream(file.getName()));
            
            out.writeInt(72);
            out.writeDouble(672.00);
            out.writeFloat(64.05F);
            
            int integer = in.readInt();
            double dob = in.readDouble();
            float flot = in.readFloat();
            
            System.out.println("Integer : "+integer);
            System.out.println("Double : "+dob);
            System.out.println("Float : "+flot);
            
            out.close();
            in.close();
        } catch(Exception e) {
            System.out.println(e);
        }
    }
}
