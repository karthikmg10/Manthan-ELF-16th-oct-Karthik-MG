package com.manthan.exception.test;

public class Paytm {
	
	void book()
	{
		System.out.println("Book started");
		
		IRCTC i=new IRCTC();
		
		try {
		
			i.confirm();
	
		}
		
		catch(ArithmeticException ar)
		{
			System.out.println("exception caught at book");
		}
		
		
		
		System.out.println("Book ended");
	}

}
