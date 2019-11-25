package com.manthan.thread;

public class PVR{
	
	synchronized void confirm() {
		for(int i=1;i<10;i++) {
			System.out.println(i);
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
