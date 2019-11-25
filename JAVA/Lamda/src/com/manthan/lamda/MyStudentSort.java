package com.manthan.lamda;

import java.util.Comparator;

public interface MyStudentSort {
	
	Comparator<Student> comId=(a,b)->{

		if(a.id>b.id)
		{
			return 1;
		}
		else if(a.id<b.id)
		{
			return -1;
		}
		else
		{
			return 0;
		}

	};

	Comparator<Student> comper=(a,b)->{

		if(a.percentage>b.percentage)
		{
			return 1;
		}
		else if(a.percentage<b.percentage)
		{
			return -1;
		}
		else
		{
			return 0;
		}

	};
	
	Comparator<Student> comname=(a,b)-> a.name.compareTo(b.name);

}
