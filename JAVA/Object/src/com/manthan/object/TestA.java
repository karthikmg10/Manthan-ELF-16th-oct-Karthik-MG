package com.manthan.object;

public class TestA {
	
	public static void main(String[] args) {
		
		Student s =new Student("priya",1,78.6);
		Student d =new Student("priya",1,78.6);
		
		boolean res=s.equals(d);
		System.out.println(res);
		
	}

}
