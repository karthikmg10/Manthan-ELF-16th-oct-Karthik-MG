package com.manthan.collections.linkedlist;

import java.util.LinkedList;

public class TestA {
	public static void main(String[] args) {
		
		LinkedList li=new LinkedList();
		li.add(5);
		li.add('F');
		li.add(2.4);
		li.add("karthik");
		
		for(int i=0;i<li.size();i++)
		{
			Object r=li.get(i);
			System.out.println(r);
		}
	
	}

}
