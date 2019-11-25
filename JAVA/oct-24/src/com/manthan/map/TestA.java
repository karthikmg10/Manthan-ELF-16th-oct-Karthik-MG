package com.manthan.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class TestA {

	public static void main(String[] args) {
		
		HashMap<Character, String>hm= new HashMap<Character, String>();
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
