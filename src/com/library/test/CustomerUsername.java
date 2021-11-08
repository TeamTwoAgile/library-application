package com.library.bean;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class CustomerUsername {

Customer customer=new Customer();

    
    @Before
	 public void customertest() {
    	customer.setUsername("Myname");
	 }

	@Test
	public void testgetUsername() {
		String actual=customer.getUsername();
		String expected= "Myname";
		assertEquals(expected, actual);
	}
		  
		@Test
		public void testsetUsername() {
			String actual=customer.getUsername();
			String expected= "Myname";
			assertEquals(expected, actual);
		}

}
