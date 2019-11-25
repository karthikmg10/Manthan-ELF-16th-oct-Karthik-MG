package com.manthan.exception.test;

public class Nullpointer {
	
	public static void main(String[] args) {
		
		System.out.println("Main started");
		
		String name= null;
		
		try {
			System.out.println(name.length() );
		} 
		
		catch (NullPointerException ne) {
			
			System.out.println("Dont deal with null");
			
		}
		
		System.out.println("Main ended");
	}

}
