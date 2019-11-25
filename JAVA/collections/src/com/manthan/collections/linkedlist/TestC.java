package com.manthan.collections.linkedlist;

import java.util.Iterator;
import java.util.LinkedList;

public class TestC {

	public static void main(String[] args) {

		LinkedList li=new LinkedList();
		li.add(5);
		li.add('F');
		li.add(2.4);
		li.add("karthik");

		Iterator it=li.iterator();
		while(it.hasNext()){
			Object r=it.next();
			System.out.println(r);
		}
	}



}
