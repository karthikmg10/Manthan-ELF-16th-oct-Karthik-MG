package com.manthan.FileHandling;

import java.io.FileWriter;

public class TestDFiles {
	
	public static void main(String[] args) {
		
		String msg = "Hve a gd day , keep smiling";
		
		char ch[] = msg.toCharArray();
		
		try {
			FileWriter fw = new FileWriter("jammer.txt");
			
			fw.write(ch);
			
			fw.flush();
			
			System.out.println("done");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
