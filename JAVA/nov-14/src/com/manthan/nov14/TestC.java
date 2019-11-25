package com.manthan.nov14;

import java.util.function.Supplier;

public class TestC {
	public static void main(String[] args) {
		
		Supplier<Student> sup = () -> new Student("Dinga", 420, 26, 42.00);
		
		Student s = sup.get();
		
		System.out.println("Name is "+s.name);
		System.out.println("Age is "+s.age);
		System.out.println("Percentage is "+s.percentage);
	}

}
