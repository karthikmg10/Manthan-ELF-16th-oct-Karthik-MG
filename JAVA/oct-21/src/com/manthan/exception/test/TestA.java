package com.manthan.exception.test;

public class TestA {

	public static void main(String[] args) {

		System.out.println("Main started");

		String name= null;
		int a[] =new int[3];
		try
		{
			System.out.println(a[5]);
			System.out.println(10/0);
			System.out.println("Hi");
			System.out.println("Have a good day");
			System.out.println(name.length());
		}

		catch(ArithmeticException ar)
		{
			System.out.println("Dont Divide by zero");
		}

		catch(NullPointerException ne)
		{
			System.out.println("Dont deal with null");
		}

		catch(ArrayIndexOutOfBoundsException ae)
		{
			System.out.println("Dont cross array boundary");
		}

		catch (Exception e) 
		{
			System.out.println("I am general catch block");
		}

		System.out.println("Main Ended");
	}

}
