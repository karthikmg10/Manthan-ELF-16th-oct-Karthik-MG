package com.manthan.thread;

public class TestC {
	
	public static void main(String[] args) {

		Pen x=new Pen();
		Thread t1=new Thread(x);
		t1.start();
	}

}
