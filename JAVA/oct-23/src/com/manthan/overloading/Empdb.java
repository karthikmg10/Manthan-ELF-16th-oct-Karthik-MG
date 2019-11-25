package com.manthan.overloading;

public class Empdb {
	
	void save(Employee em) {
		
		System.out.println("/*************Saving Employee DB********************/");
		System.out.println("Name is: "+ em.getName());
		System.out.println("id is: "+em.getId());
		System.out.println("gender is: "+em.getGender());
		System.out.println("height is: "+em.getHeight());
	}
	
	

}
