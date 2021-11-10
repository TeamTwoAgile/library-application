package com.library.test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.library.bean.Customer;

public class CustomerCardDetails {

Customer customer=new Customer();

    
    @Before
	 public void customertest() {
    	customer.setCardDetails("1234567823413457");
	 }

	@Test
	public void testgetCardDetails() {
		String actual=customer.getCardDetails();
		String expected= "1234567823413457";
		assertEquals(expected, actual);
	}
		  
		@Test
		public void testsetCardDetails() {
			String actual=customer.getCardDetails();
			String expected= "1234567823413457";
			assertEquals(expected, actual);
		}

}
