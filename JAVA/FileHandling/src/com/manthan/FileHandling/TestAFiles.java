package com.manthan.FileHandling;

import java.io.File;

public class TestAFiles {
	public static void main(String[] args) {
		
		File f = new File("D:/karthik.txt");
		
		try {
			f.createNewFile();
			System.out.println("done");
		}
		catch (Exception e) {
			System.out.println("sorry could not create the file");
		}
		
	}

}
