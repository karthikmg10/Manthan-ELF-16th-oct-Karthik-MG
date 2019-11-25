package com.manthan.collections.set;

import java.util.LinkedHashSet;
import java.util.Iterator;

public class TestC {

	public static void main(String[] args) {

		LinkedHashSet hs=new LinkedHashSet();
		hs.add("Yamaha");
		hs.add("Honda");
		hs.add("Hero");
		hs.add("Aprilla");
		hs.add(null);

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



