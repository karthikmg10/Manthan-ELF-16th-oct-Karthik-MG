package com.manthan.collections.arraylist;

import java.util.ArrayList;

public class TestB {
	public static void main(String[] args) {

		ArrayList al=new ArrayList();

		al.add(5);
		al.add('F');
		al.add(2.4);
		al.add("karthik");
		
		for(Object r:al)
		{
			System.out.println(r);
		}
	}

}
