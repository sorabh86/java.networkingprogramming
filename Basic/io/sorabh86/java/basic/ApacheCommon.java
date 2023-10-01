package io.sorabh86.java.basic;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;

public class ApacheCommon {

	public static void main(String arg[]) {
		File f1 = new File("assets/basic/source.txt");
		File f2 = new File("assets/basic/ApaTarget.txt");
		
		try {
			FileUtils.copyFile(f1, f2);
			System.out.println("File is copy successfully!");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
