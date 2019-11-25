package com.manthan.collections.set;

import java.util.HashSet;
import java.util.Iterator;

public class TestA {
	
	public static void main(String[] args) {
		
		HashSet hs = new HashSet();
		hs.add("Yamaha");
		hs.add(9678);
		hs.add("honda");
		hs.add(4569);
		
		System.out.println("************for each************");
		for(Object r:hs)
		{
			System.out.println(r);
		}
		
		System.out.println("***************Iterator***********");
		Iterator it = hs.iterator();
		while(it.hasNext())
		{
			Object r=it.next();
			System.out.println(r);
		}
	}

}
