package com.manthan.exception.test;

public class IRCTC {

	void confirm() {
		
		System.out.println("confirm started");
		try {
		System.out.println(10/2);
		}
		
		catch(ArithmeticException af) {
			
			System.out.println("exception caught at confirm");
			
			throw af;
		}
		
		finally
		{
			System.out.println("confirm ended");
		}
		
	}
	
	
	
}
