package com.manthan.collections.linkedlist;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class TestF {

	public static void main(String[] args) {

		LinkedList<String> li=new LinkedList<String>();
		li.add("Arjun");
		li.add("Arun");
		li.add("Suraj");
		li.add("karthik");

		System.out.println("**********FOR LOOP********");
		for(int i=0;i<li.size();i++)
		{
			String r=li.get(i);
			System.out.println(r);
		}

		System.out.println("************FOR EACH*********");
		for(String r:li)
		{
			System.out.println(r);
		}

		ListIterator<String> lit=li.listIterator();
		System.out.println("**************ITERATOR***********");

		Iterator it=li.iterator();
		while(lit.hasNext()){
			String r=lit.next();
			System.out.println(r);

		}
	}
}
