package com.manthan.assignment;

import java.util.Scanner;
import java.util.function.Function;

public class TestChips {
	
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		Chips c = new Chips();
		
		Function<Integer, Chips> a = cc->{
			
			int x=cc;
			
			switch (x) {
			case 1:
				
				return new Kurkure();
				
			case 2:
				
				return new Lays();

			case 3:
				
				return new Bingo();
			}
			
			return null;
		};
		
		System.out.println("Enter the Choice");
		System.out.println("1 for Kurkure");
		System.out.println("2 for Lays");
		System.out.println("3 for Bingo");
		
		Integer y = s.nextInt();
		Chips f=a.apply(y);
		f.which();
	}

}
