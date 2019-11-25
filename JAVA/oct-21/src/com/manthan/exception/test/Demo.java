package com.manthan.exception.test;

public class Demo {

	public static void main(String[] args) {
		
		System.out.println("Main started");
		
		try
		{
			System.out.println(10/0);
		}
		
		catch (ArithmeticException a) {
			
			System.out.println("Please dont divide by zero");
		}
		
		System.out.println("Main Ended");
	}
}
