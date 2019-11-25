package com.manthan.exception.test;

import java.io.File;
import java.io.IOException;

public class DemoD {

	void run() throws IOException
	{
		File f=new File("demo.txt");

		f.createNewFile();
	}
}


