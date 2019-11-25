package com.manthan.set;

import java.util.Iterator;
import java.util.TreeSet;

public class TestA {
	public static void main(String[] args) {
		
		StudentById sid=new StudentById();
		StudentByPercentage sper=new StudentByPercentage();
		
		Student s1=new Student(5, "Karthik", 62.25);
		Student s2=new Student(3, "Arun", 56.25);
		Student s3=new Student(2, "Babu", 45.25);
		Student s4=new Student(4, "Arjun", 55.25);
		
		TreeSet<Student> set=new TreeSet<Student>(sid);
		set.add(s1);
		set.add(s2);
		set.add(s3);
		set.add(s4);
		
		Iterator<Student> iterator=set.iterator();
		while(iterator.hasNext())
		{
			Student s=iterator.next();
			System.out.println("Id is "+ s.id);
			System.out.println("name is "+s.name);
			System.out.println("percentage is "+s.percentage);
			System.out.println("----------------------------");
		}
		
	}
	
	

}
