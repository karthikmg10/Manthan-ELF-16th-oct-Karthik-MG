package com.manthan.collections.vector;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Vector;

public class TestA {
	
	public static void main(String[] args) {

		Vector<Character> v=new Vector<Character>();
		v.add('a');
		v.add('r');
		v.add('r');
		v.add('K');
		
		System.out.println("**********FOR LOOP********");
		for(int i=0;i<v.size();i++)
		{
			Character r=v.get(i);
			System.out.println(r);
		}

		System.out.println("************FOR EACH*********");
		for(Character r:v)
		{
			System.out.println(r);
		}


		System.out.println("**************ITERATOR***********");

		Iterator<Character> it=v.iterator();
		while(it.hasNext()){
			Character r=it.next();
			System.out.println(r);

		}
}
}
