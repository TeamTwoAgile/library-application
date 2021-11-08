package com.library.bean;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class CustomerMethodLastName {

Customer customer=new Customer();
    
    @Before
	 public void customertest() {
    	customer.setLastName("Samuel");
	 }
    
	@Test
	public void testgetLastName() {
		String actual=customer.getLastName();
		String expected= "Samuel";
		assertEquals(expected, actual);
	}
		  
		@Test
		public void testsetLastName() {
			String actual=customer.getLastName();
			String expected= "Samuel";
			assertEquals(expected, actual);
		}

}
