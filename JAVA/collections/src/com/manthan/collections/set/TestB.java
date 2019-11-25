package com.manthan.collections.set;

import java.util.HashSet;
import java.util.Iterator;

public class TestB {
	
	public static void main(String[] args) {
		
		HashSet<String> hs=new HashSet<String>();
		hs.add("Yamaha");
		hs.add("Honda");
		hs.add("Hero");
		hs.add("Aprilla");
		hs.add(null);
		hs.add(null);
		
		System.out.println("************for each************");
		for(String r:hs)
		{
			System.out.println(r);
		}
		
		System.out.println("***************Iterator***********");
		Iterator<String> it = hs.iterator();
		while(it.hasNext())
		{
			String r=it.next();
			System.out.println(r);
		}
	}

}
