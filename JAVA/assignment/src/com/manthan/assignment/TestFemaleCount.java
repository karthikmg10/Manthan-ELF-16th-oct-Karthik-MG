package com.manthan.assignment;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class TestFemaleCount {
	
public static void main(String[] args) {
		
		Student s1 = new Student("Ram",'M',84.21);
		Student s2 = new Student("Ramya",'F',88.21);
		Student s3 = new Student("Ramu",'M',81.21);
		Student s4 = new Student("Rani",'F',89.21);
		Student s5 = new Student("Ramanji",'M',95.21);
		Student s6 = new Student("swetha",'F',92.21);
		
		List<Student> stu = new ArrayList<Student>();
		stu.add(s6);
		stu.add(s5);
		stu.add(s4);
		stu.add(s3);
		stu.add(s2);
		stu.add(s1);
		
		Predicate<Student> fr = stud->stud.gender=='F';
		
		List<Student> stf = stu.stream().filter(fr).collect(Collectors.toList());
		System.out.println("female topper is "+stf);

}
}
