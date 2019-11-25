package com.manthan.collections.vector;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class TestStudent {
	
	public static void main(String[] args) {
		
		ArrayList<Student> al=new ArrayList<Student>();
		
		Student s1=new Student("Karthik",1,6.5);
		Student s2=new Student("Arun",2,8.5);
		Student s3=new Student("Aravind",8,5.5);
		Student s4=new Student("Dinesh",9,6.9);
		
		al.add(s1);
		al.add(s2);
		al.add(s3);
		al.add(s4);
		
		System.out.println("****************FOR LOOP*************");
		for(int i=0;i<al.size();i++)
		{
			Student s=al.get(i);
			System.out.println("Name is: "+s.name);
			System.out.println("ID is: "+s.id);
			System.out.println("Percentage is: "+s.percentage);
			System.out.println("******************************");
		}
		
		
		System.out.println("***************FOR EACH************");
		
		for(Student r:al)
		{
			System.out.println(r);
			System.out.println("Name is: "+r.name);
			System.out.println("ID is: "+r.id);
			System.out.println("Percentage is: "+r.percentage);
			System.out.println("******************************");
		}
		
		System.out.println("*******************ITREATOR***************");
		
		Iterator<Student> it=al.iterator();
		while(it.hasNext()){
			Student r=it.next();
			System.out.println(r);
			System.out.println("Name is: "+r.name);
			System.out.println("ID is: "+r.id);
			System.out.println("Percentage is: "+r.percentage);
			System.out.println("******************************");
		}
		
			
	
	}

}
