package com.manthan.exception.test;

public class TestG {
	
	public static void main(String[] args) {
		
		System.out.println("Main Started");
		
		AgeSimulator a=new AgeSimulator();
		try {
			a.verify(24);
			System.out.println("enter and enjot the party");
		} catch (InvalidAgeException d) {
			
			d.printStackTrace();
		}
		
		System.out.println("Main ended");
	}

}
