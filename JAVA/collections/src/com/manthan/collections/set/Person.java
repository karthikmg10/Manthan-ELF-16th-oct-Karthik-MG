package com.manthan.collections.set;

public class Person implements Comparable<Person> {
	
	String name;
	int id;
	double height;
	
	public Person(String name, int id, double height) {
		this.name = name;
		this.id = id;
		this.height = height;
	}
	
	/*
	 * public int compareTo(Person x) { if(this.id>x.id) { return 1; } else if
	 * (this.id<x.id) { return -1; } else { return 0; } }
	 */
	
//	public int compareTo(Person x) {
//		if(this.height>x.height)
//		{
//			return 1;
//		}
//		else if (this.height<x.height) 
//		{
//			return -1;
//		}
//		else
//		{
//			return 0;
//		}
	
	public int compareTo(Person x)
	{
		return this.name.compareTo(x.name);
	}
}

	


	