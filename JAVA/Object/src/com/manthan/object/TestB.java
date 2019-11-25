package com.manthan.object;

public class TestB {


	public static void main(String[] args) {
		
		Animal a=new Cow();
		
		Cow c=(Cow)a;
		c.cost=100;
		c.eat();
		c.size=5.6;
		c.run();
		
		System.out.println("cost is:" +c.cost);
		System.out.println("size is:" +c.size);
		
	}
}
