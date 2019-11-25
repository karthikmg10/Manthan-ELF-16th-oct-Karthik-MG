package com.manthan.set;

import java.util.Comparator;

public class StudentByPercentage implements Comparator<Student> {

	@Override
	public int compare(Student a, Student b) {

		if(a.percentage<b.percentage) 
		{
			return -1;
		}
		else if(a.percentage>b.percentage)
		{
			return 1;
		}
		else
		{
			return 0;
		}
		
//		public int compare(Student a, Student b) {
//			
//			Double a = a.percentage;
//			Double b = b.percentage;
//			return a.compareTo(b)
//		}

	}
}
