package com.library.test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.library.bean.Customer;

public class CostomerMethodAddress {

Customer customer=new Customer();

    
    @Before
	 public void customertest() {
    	customer.setAddress("12A green street dublin");
	 }

	@Test
	public void testgetAddress() {
		String actual=customer.getAddress();
		String expected= "12A green street dublin";
		assertEquals(expected, actual);
	}
		  
		@Test
		public void testsetAddress() {
			String actual=customer.getAddress();
			String expected="12A green street dublin";
			assertEquals(expected, actual);
		}


}
