package com.manthan;

public class TestE {
	public static void main(String[] args) {
		
		MI m=new MI();
		Pixel p=new Pixel();
		Iphone i=new Iphone();
		
		Crush c=new Crush();
		c.recive(p);
		c.recive(i);
		c.recive(m);
		c.recive(null);
	}
	

}
