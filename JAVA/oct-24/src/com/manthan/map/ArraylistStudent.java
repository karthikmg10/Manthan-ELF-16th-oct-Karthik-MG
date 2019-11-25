package com.manthan.map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class ArraylistStudent {
	
	public static void main(String[] args) {
		
		HashMap<String, ArrayList<Student>> hm=new HashMap<String, ArrayList<Student>>();
		
		ArrayList<Student> al1=new ArrayList<Student>();
		Student s1=new Student("Karthik",1,6.5);
		Student s2=new Student("Arun",2,8.5);
		Student s3=new Student("Aravind",8,5.5);
		Student s4=new Student("Dinesh",9,6.9);
		
		al1.add(s1);
		al1.add(s2);
		al1.add(s3);
		al1.add(s4);
		
		ArrayList<Student> al2=new ArrayList<Student>();
		Student s5=new Student("Dinesh",1,7.5);
		Student s6=new Student("Karthik",2,6.5);
		Student s7=new Student("Arun",8,8.5);
		Student s8=new Student("Arjun",9,4.9);
		
		al2.add(s5);
		al2.add(s6);
		al2.add(s7);
		al2.add(s8);
		
		ArrayList<Student> al3=new ArrayList<Student>();
		Student s9=new Student("Ramu",1,5.5);
		Student s10=new Student("Anusha",2,9.5);
		Student s11=new Student("Kamesh",8,4.5);
		Student s12=new Student("Pradeep",9,8.9);
		
		al2.add(s9);
		al2.add(s10);
		al2.add(s11);
		al2.add(s12);
		
		hm.put("first",al1);
		hm.put("second", al2);
		hm.put("third", al3);
		
		Set<Map.Entry<String, ArrayList<Student>>> ts= hm.entrySet();
		for(Map.Entry<String, ArrayList<Student>> e:ts)
		{
			String key=e.getKey();
			ArrayList<Student>al=e.getValue();
			System.out.println("class Name "+key);
			Iterator<Student> it=al.iterator();
			while(it.hasNext())
			{
				Student s=it.next();
			System.out.println("Name is: "+s.name);
			System.out.println("ID is: "+s.id);
			System.out.println("Percentage is: "+s.percentage);
			System.out.println("--------------------------------------------------");
			
			}
			
		}
		
		System.out.println("******************************************************");	
			
		}
		
		
		

}
