package com.manthan.FileHandling;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class TestBFiles {
	
	public static void main(String[] args) {
		
		String msg = "hi hw r u dng .....?";
		
		byte[] by = msg.getBytes();
		
		try {
			FileOutputStream fout = new FileOutputStream("dinga.txt");
			fout.write(by);
			System.out.println("done");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
