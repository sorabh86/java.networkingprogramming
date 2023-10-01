package io.sorabh86.java.basic;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;

public class Network {
	
	public static void main(String[] args) {
		try {
			System.out.println("started");
			URL url = new URL("http://sorabh.netii.net/sandrosincro/scenario.xml");
			InputStream stream = url.openStream();
			BufferedInputStream buff = new BufferedInputStream(stream);
			
			StringBuilder sb = new StringBuilder();
			while(true) {
				int data = buff.read();
				if(data==-1)
					break;
				else
					sb.append((char)data);
			}
			
			System.out.println(sb);
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("ended");
	}
}
