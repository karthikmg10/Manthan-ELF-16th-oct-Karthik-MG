package com.manthan.exception.test;

import java.io.File;
import java.io.IOException;

public class TestD {
	
	public static void main(String[] args) {
		
		System.out.println("Main started");
		
		File f=new File("karthik.txt");
		try
		{
			f.createNewFile();
			System.out.println("File created");
		}
		
		catch (IOException e) {
			
			System.out.println("Sorry could not create a file");
		}
		
		System.out.println("Main ended");
	}

}
