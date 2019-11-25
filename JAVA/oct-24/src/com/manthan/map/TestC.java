package com.manthan.map;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class TestC {
	
public static void main(String[] args) {
		
		TreeMap<Integer, String> hm= new TreeMap<Integer, String>();
		hm.put(23,"Man");
		hm.put(56,"lion");
		hm.put(86,"eagle");
		hm.put(45,"Road");
		
		Set<Map.Entry<Integer, String>> se =hm.entrySet();
		
		for(Map.Entry<Integer, String> x:se)
		{
			Integer k=x.getKey();
			String v=x.getValue();
			
			System.out.println("key "+k);
			System.out.println("value "+v);
			System.out.println("---------------------------");
		}
	}

}
