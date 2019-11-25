package com.manthan.assignment;

import java.util.function.Consumer;

public class TestSound {
	
	public static void main(String[] args) {
		
		Consumer<AnimalSound> a =s->{
			
			if(s instanceof Cow) {
				System.out.println("MOOO MOOO");
			}
			if(s instanceof Cat) {
				System.out.println("MEEOWW MEEOWW");
			}
			if(s instanceof Dog) {
				System.out.println("BOOW BOOW");
			}
		};
		
		a.accept(new Dog());
	}

}
