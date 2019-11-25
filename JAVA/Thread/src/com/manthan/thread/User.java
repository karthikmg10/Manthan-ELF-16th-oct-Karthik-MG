package com.manthan.thread;

public class User extends Thread {
	
		PVR p;
		
		public User(PVR ref) {
			this.p =ref;
		}
		
		public void run()
		{
			p.confirm();
		}
		
}
