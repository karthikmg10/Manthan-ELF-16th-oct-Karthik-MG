package com.manthan.collections.arraylist;

import java.util.ArrayList;
import java.util.ListIterator;

public class TestE {
	
	public static void main(String[] args) {
		
		ArrayList al=new ArrayList();

		al.add(5);
		al.add('F');
		al.add(2.4);
		al.add("karthik");

		ListIterator lit=al.listIterator(al.size());
		while(lit.hasPrevious()) {
			
			Object r = lit.previous();
			System.out.println(r);
		}
	}

}
