package com.manthan.set;

import java.util.Comparator;

public class StudentById implements Comparator<Student> {

	@Override
	public int compare(Student a, Student b) 
	{

		if(a.id<b.id) 
		{
			return -1;
		}
		else if(a.id>b.id)
		{
			return 1;
		}
		else
		{
			return 0;
		}
	}

}
