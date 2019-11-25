package com.manthan.array;

public class TestC {
public static void main(String[] args) {
	
	Student[] s=new Student[4];
	
	Student s1=new Student("Karthik", 101, 6.5);
	Student s2=new Student("Arun", 102, 7.5);
	Student s3=new Student("Raju", 106, 8.5);
	Student s4=new Student("Manju", 108, 6.2);
	
	s[0]=s1;
	s[1]=s2;
	s[2]=s2;
	s[3]=s3;
	
	for(Student r:s)
	{
		System.out.println(r.name);
		System.out.println(r.id);
		System.out.println(r.percentage);
		System.out.println("----------------------------");
	}
}
}
