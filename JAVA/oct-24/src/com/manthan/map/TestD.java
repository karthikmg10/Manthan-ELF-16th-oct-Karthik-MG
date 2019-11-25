package com.manthan.map;

import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.Hashtable;

public class TestD {

	public static void main(String[] args) {
		
		Hashtable<String, Integer> hm= new Hashtable<String, Integer>();
		hm.put("Man", 23);
		hm.put("lion", 56);
		hm.put("eagle", 86);
		hm.put("Road", 45);

		Set<Map.Entry<String, Integer>> se =hm.entrySet();

		for(Map.Entry<String, Integer> x:se)
		{
			String k=x.getKey();
			Integer v=x.getValue();

			System.out.println("key "+k);
			System.out.println("value "+v);
			System.out.println("---------------------------");
		}
	}

}
