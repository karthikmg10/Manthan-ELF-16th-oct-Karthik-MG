package com.manthan.exception.test;

public class AgeSimulator {
	
	void verify(int age) throws InvalidAgeException
	{
		
			if(age<18);
			{
				InvalidAgeException d=new InvalidAgeException();
				throw d; 
			}
	}

}
