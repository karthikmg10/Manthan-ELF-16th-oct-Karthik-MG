package com.manthan.exception.test;

public class TestC {
	
	public static void main(String[] args) {
		
		System.out.println("Main started");
		
		Paytm p=new Paytm();
		try {
		p.book();
		}
		
		catch(ArithmeticException ae) {
			
			System.out.println("exception caught at main");
		}
		System.out.println("Main ended");
	}

}
