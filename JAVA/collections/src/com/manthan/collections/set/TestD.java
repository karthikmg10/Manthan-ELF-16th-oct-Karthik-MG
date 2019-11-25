package com.manthan.collections.set;

import java.util.LinkedHashSet;
import java.util.Iterator;

public class TestD {
	
	public static void main(String[] args) {
		
		LinkedHashSet<String> hs=new LinkedHashSet<String>();
		hs.add("Yamaha");
		hs.add("Honda");
		hs.add("Hero");
		hs.add("Aprilla");
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
