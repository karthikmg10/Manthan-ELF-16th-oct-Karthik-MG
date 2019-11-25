package com.manthan.exception.test;

public class TestB {

	public static void main(String[] args) {

		int a[] =new int[3];

		System.out.println("Main started");

		try
		{
			System.out.println(a[5]);
		}

		catch(ArrayIndexOutOfBoundsException ae)
		{
			System.out.println("Dont cross array boundary");
		}

		System.out.println("main ended");
	}

}
