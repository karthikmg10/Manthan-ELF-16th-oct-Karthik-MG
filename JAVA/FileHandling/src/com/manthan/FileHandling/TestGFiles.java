package com.manthan.FileHandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class TestGFiles {

	public static void main(String[] args) {

		try {
			FileInputStream fin = new FileInputStream("myDBConfigif.properties");

			Properties pr = new Properties();
			pr.load(fin);

			String user = pr.getProperty("user");
			String url = pr.getProperty("url");

			System.out.println("user is "+user);
			System.out.println("url is "+url);

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
