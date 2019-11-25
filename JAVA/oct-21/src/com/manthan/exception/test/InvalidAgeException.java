package com.manthan.exception.test;

public class InvalidAgeException extends Exception {
	
	private String message ="Sorry you are too young";
	
	public InvalidAgeException() {
		
	}
	
	public InvalidAgeException(String message) {
		this.message=message;
	}
	
	public String getmessage() {
		return message;
	}

}
