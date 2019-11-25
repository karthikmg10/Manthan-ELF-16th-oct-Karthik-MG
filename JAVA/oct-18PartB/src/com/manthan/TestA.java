package com.manthan;

public class TestA {
	public static void main(String[] args) {
		
		Pen p=new Pen();
		p.open();
		p.write();
		
		Person a=new Person();
		a.recive(p);
		
		
	}

}
