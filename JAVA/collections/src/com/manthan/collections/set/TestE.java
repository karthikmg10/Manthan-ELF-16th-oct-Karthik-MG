package com.manthan.collections.set;

import java.util.TreeSet;

public class TestE {
	
	public static void main(String[] args) {
		
		TreeSet<String> ts=new TreeSet<String>();
		ts.add("karthik");
		ts.add("jaggu");
		ts.add("bheem");
		ts.add("kalia");
		
		for(String s:ts)
		{
			System.out.println(s);
		}
		
	}

}
