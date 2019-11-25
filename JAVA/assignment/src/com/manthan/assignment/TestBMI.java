package com.manthan.assignment;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class TestBMI {

	public static void main(String[] args) {
		
		BMI b1 = new BMI(54,152);
		BMI b2 = new BMI(45,159);
		BMI b3 = new BMI(75,192);
		BMI b4 = new BMI(64,142);
		BMI b5 = new BMI(69,162);
		BMI b6 = new BMI(84,158);
		
		List<BMI> li=new ArrayList<BMI>();
		
		Predicate<BMI> pr = bmm->bmm.weight/bmm.height>=22.1;
		
		List<BMI> bmilist= li.parallelStream().filter(pr).collect(Collectors.toList());
		
		System.out.println(bmilist);
	}
}
