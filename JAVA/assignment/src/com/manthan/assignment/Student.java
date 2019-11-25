package com.manthan.assignment;

public class Student {
	
		
		String name;
		char gender;
		Double per;
		
		public Student(String name, char gender, Double per) {
			this.name = name;
			this.gender = gender;
			this.per = per;
		}

		@Override
		public String toString() {
			return "Student [name=" + name + ", gender=" + gender + ", per=" + per + "]";
		}
		
	
	
}

