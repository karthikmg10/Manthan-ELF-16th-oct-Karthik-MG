package com.manthan.collections.set;

import java.security.PublicKey;
import java.util.TreeSet;

public class TestPerson {
	public static void main(String[] args) {
		TreeSet<Person> hs = new TreeSet<Person>();
		
		Person p1=new Person("ARUN", 101, 5.75);
		Person p2=new Person("CHITTI", 105, 6.75);
		Person p3=new Person("BABU", 103, 7.25);
		Person p4=new Person("AMITH", 104, 5.62);
		
		hs.add(p1);
		hs.add(p2);
		hs.add(p3);
		hs.add(p4);
		
		for(Person p:hs)
		{
			System.out.println("Name is: "+p.name);
			System.out.println("ID is: "+p.id);
			System.out.println("Height is:" +p.height);
			System.out.println("**************************************************************");
					
			
		}
		
	}
	
	
	

}
