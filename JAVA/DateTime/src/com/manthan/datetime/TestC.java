package com.manthan.datetime;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class TestC {
	
	public static void main(String[] args) {
		
		LocalDateTime ldt=LocalDateTime.now();
		DateTimeFormatter dtf=DateTimeFormatter.ofPattern("dd-MM-yyyy h:m:s");
		
		String res=dtf.format(ldt);
		System.out.println(res);
	}

}
