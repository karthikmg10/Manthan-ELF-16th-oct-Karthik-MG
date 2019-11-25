package com.manthan.thread;

public class TestB {
	
	public static void main(String[] args) {
		
		PVR i=new PVR();
		
		User t1=new User(i);
		t1.start();
		User t2=new User(i);
		t2.start();
	}
}
