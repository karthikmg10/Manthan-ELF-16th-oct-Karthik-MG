package com.manthan.list;


import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;

public class TestA {
	
public static void main(String[] args) {
		
		Collection<Double> pq=new ArrayList<Double>();
		pq.add(53.6);
		pq.add(36.5);
		pq.add(78.6);
		pq.add(43.5);
		
		
		Iterator<Double> it=pq.iterator();
		while(it.hasNext())
		{
			Double r=it.next();
			System.out.println(r);
		}
	}

}
