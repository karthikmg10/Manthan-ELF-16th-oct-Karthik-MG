package com.manthan.nov14;

import java.util.function.Function;

public class TestLam {
	
	public static void main(String[] args) {
		
		Function<String, Integer>fn = x -> x.length();
		
		int ans = fn.apply("Bengaluru");
		
		System.out.println("lengh is "+ans);
	}

}
