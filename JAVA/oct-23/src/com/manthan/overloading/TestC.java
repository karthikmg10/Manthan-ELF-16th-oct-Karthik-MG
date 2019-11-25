package com.manthan.overloading;

public class TestC {

	public static void main(String[] args) {

		Employee e=new Employee();
		e.setName("Karthik");
		e.setId(101);
		e.setGender('M');
		e.setHeight(5.25);

		Empdb d=new Empdb();
		d.save(e);

	}
}
