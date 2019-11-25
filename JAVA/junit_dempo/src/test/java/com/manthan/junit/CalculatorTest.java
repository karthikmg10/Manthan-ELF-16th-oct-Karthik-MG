package com.manthan.junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CalculatorTest {
	private Calculator c;
	
	@BeforeEach
       public void createObj() {
		c=new Calculator();
	}
	@Test
	public void testAdd() {
		int res=c.add(10, 20);
		assertEquals(30, res);
		
	}
	@Test
	public void testDiv() {
		int resDiv=c.divide(20, 4);
		assertEquals(5, resDiv);
	}
     @Test
     public void testDivForExceptn() {
    	 assertThrows(ArithmeticException.class, ()->c.divide(10,0));
     }
}
