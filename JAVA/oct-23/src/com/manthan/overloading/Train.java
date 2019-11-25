package com.manthan.overloading;

public class Train {

		void search(String name) {
			
			System.out.println("Searching train by name "+name);
		}
		
		void search(int num) {
			
			System.out.println("Searching train by number "+num);
		}
}
