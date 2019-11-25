package com.manthan.nov14;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class TestF {
	public static void main(String[] args) {
		
		List<Integer> al = new ArrayList<Integer>();
		al.add(10);
		al.add(5);
		al.add(2);
		al.add(8);
		al.add(7);
		
		Comparator<Integer> c = (i,j) -> i.compareTo(j);  
		
		int max = al.stream().max(c).get();
		int min = al.stream().min(c).get();
		
		System.out.println(max);
		System.out.println(min);
	}
	

}
