package com.manthan.exception.test;

import java.io.IOException;

public class TestE {

	public static void main(String[] args)  {

		DemoD r=new DemoD();
		try {
			r.run();
		}
		catch (IOException e) {
			e.printStackTrace();
		}
	}
}


