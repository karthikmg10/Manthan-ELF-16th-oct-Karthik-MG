package com.manthan.nov14;

import java.util.function.Function;

public class TestA {
	
	public static void main(String[] args) {
		
		Student st = new Student("karthik", 101, 23, 65.12);
		
		Function<Student, Student> fn = s-> {
			st.percentage = st.percentage + 4;
			return st;
		};
		
		Student t = fn.apply(st);
		System.out.println("after Lambda"+st.percentage);
	}

}
