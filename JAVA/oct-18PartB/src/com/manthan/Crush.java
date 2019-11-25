package com.manthan;

public class Crush {
	
	void recive(Phone p)
	{
		if (p instanceof MI) {
			
			System.out.println("Thank you brother");
			
		}
		
		else if (p instanceof Pixel) {
			
			System.out.println("Thank you dear");
		}
		
		else if(p instanceof Iphone) {
			
			System.out.println("I Love You");
		}
		
		else {
			System.out.println("Bye Bye......");
		}
	}

}
