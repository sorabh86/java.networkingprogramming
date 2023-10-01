import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
public class CopyFile {
	public static void main(String[] args) {
		File f1 = new File("source.txt");
		File f2 = new File("target.txt");
		
		try {
			InputStream in = new FileInputStream(f1);
			OutputStream out = new FileOutputStream(f2);
			
			byte[] buff = new byte[1024];
			int len;
			while((len = in.read(buff)) > 0) {
				out.write(buff, 0, len);
			}
			in.close();
			out.close();
			
			System.out.println("file is copied!");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
