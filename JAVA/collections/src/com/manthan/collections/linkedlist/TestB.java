package com.manthan.collections.linkedlist;

import java.util.LinkedList;

public class TestB {

	public static void main(String[] args) {

		LinkedList li=new LinkedList();
		li.add(5);
		li.add('F');
		li.add(2.4);
		li.add("karthik");
		
		for(Object r:li)
		{
			System.out.println(r);
		}
	}

	}
