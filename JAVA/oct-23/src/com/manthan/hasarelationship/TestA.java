package com.manthan.hasarelationship;

public class TestA {
	public static void main(String[] args) {
		Person p=new Person();
		p.age=24;
		p.m.model=1996;
		p.m.docall();
		p.walk();
		
		System.out.println("Age is: "+p.age);
		System.out.println("model is: "+p.m.model);
		
	}
	
	
	
	
	

}
