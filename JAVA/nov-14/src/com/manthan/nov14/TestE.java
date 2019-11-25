package com.manthan.nov14;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class TestE {
	
	public static void main(String[] args) {
		
		List<Integer> al = new ArrayList<Integer>();
		al.add(10);
		al.add(5);
		al.add(2);
		al.add(8);
		al.add(7);
		
		
		Function<Integer, Integer> f = i -> i *10;
		
		List<Integer> bl = al.stream().map(f).collect(Collectors.toList());
		
		System.out.println(bl);
	}

}
