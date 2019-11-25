package com.manthan.exception.test;

public class TestF {
	
	public static void main(String[] args) {
		
		System.out.println("Main started");
		
		ATMSimulator a=new ATMSimulator();
		
		try {
		a.verify(410000);
		System.out.println("please dont withdraw above 40000");
		}
		
		catch (DaylimitException e)
		{
			e.printStackTrace();
		}
		
		System.out.println("Main ended");
		
	}

}
