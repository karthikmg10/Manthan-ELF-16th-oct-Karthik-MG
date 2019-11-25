package com.manthan.exception.test;

public class DaylimitException extends RuntimeException {
	
	private String message = "Sorry you crossed the day limit";
	
	public DaylimitException() {
		
	}

	public DaylimitException(String message) {
		this.message = message;
	}

	
	public String getmessage() {
		return message;
	}

}
