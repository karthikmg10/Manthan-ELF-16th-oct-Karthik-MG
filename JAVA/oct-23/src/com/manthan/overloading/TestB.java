package com.manthan.overloading;

public class TestB {

	public static void main(String[] args) {
		
		Student s=new Student();
		s.setName("Karthik");
		s.setId(101);
		
		DB d=new DB();
		d.save(s);
		
		
	}
}
