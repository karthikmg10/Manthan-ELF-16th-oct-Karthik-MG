package com.manthan.lamda;

public class TestA {

	public static void main(String[] args) {
		
		Pen p= (i,j)->i+j;
		
		int y = p.add(20, 10);
		
		System.out.println("Reslt is "+y);
		
	}
}
