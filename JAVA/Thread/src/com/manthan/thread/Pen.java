package com.manthan.thread;

public class Pen implements Runnable{
	
	public void run()
	{
		for(int i=0;i<5;i++) {
			System.out.println(i);
		}
	}

}
