package com.manthan.collections.linkedlist;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class TestD {

	public static void main(String[] args) {

		LinkedList li=new LinkedList();
		li.add(5);
		li.add('F');
		li.add(2.4);
		li.add("karthik");

		ListIterator lit=li.listIterator();
		System.out.println("-------------------> Forward");
		while(lit.hasNext()){
		Object r=lit.next();
		System.out.println(r);
	}
		System.out.println("<-----------------Backward");
		while(lit.hasPrevious()) {
		Object r=lit.previous();
		System.out.println(r);
	
		}
	}



}
