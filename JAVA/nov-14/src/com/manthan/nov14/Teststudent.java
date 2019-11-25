package com.manthan.nov14;

import java.util.function.Predicate;

public class Teststudent {
	
	public static void main(String[] args) {
		
		
		Student st = new Student("Karthik", 101, 23, 60.1);
		
		Predicate<Student> ps = s -> {
			if(s.percentage >=35) {
				return true;
			} else {
				return false;
			}
		};
		
		boolean ans = ps.test(st);
		System.out.println("Result is "+ans);
	} 
}
