package com.manthan.map;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class TestB {
	
	public static void main(String[] args) {
		
		LinkedHashMap<Character, String> hm= new LinkedHashMap<Character, String>();
		hm.put('M', "man");
		hm.put('a', "Apple");
		hm.put('A', "Anil");
		hm.put('f', "Fan");
		
		Set<Map.Entry<Character, String>> se =hm.entrySet();
		
		for(Map.Entry<Character, String> x:se)
		{
			Character k=x.getKey();
			String v=x.getValue();
			
			System.out.println("key "+k);
			System.out.println("value "+v);
			System.out.println("---------------------------");
		}
	}

}
