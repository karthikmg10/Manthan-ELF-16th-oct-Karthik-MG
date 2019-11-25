package com.manthan.nov14;

import java.util.function.Consumer;

public class TestB {

	public static void main(String[] args) {
		
		Student st = new Student("karthik", 101, 23, 65.12);
		
		Consumer<Student> c =
		s -> {
			System.out.println("Name is "+s.name);
			System.out.println("Age is "+s.age);
			System.out.println("Percentage is "+s.percentage);			
		};
		
		c.accept(st);
	}
}
