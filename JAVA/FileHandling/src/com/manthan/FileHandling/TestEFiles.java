package com.manthan.FileHandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class TestEFiles {
	
	public static void main(String[] args) {
		
		try {
			FileInputStream fin = new FileInputStream("jammer.txt");
			int m;
			while((m = fin.read())!=-1){
				System.out.print((char)m);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
