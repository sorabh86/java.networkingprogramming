import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;


public class ApacheCommon {
	
	public static void main(String arg[]) {
		File f1 = new File("source.txt");
		File f2 = new File("ApaTarget.txt");
		
		try {
			FileUtils.copyFile(f1, f2);
			System.out.println("File is copy successfully!");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
