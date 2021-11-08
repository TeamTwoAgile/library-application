package com.library.test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.library.bean.Customer;

public class CustomerMethodTitle {

    Customer customer=new Customer();
   
    @Before
	 public void customertest() {
    	customer.setTitle("123");
	 }
    
	@Test
	public void testgettitle() {
		String actual=customer.getTitle();
		String expected= "123";
		assertEquals(expected, actual);
	}
		  
		@Test
		public void testsettitle() {
			String actual=customer.getTitle();
			String expected= "123";
			assertEquals(expected, actual);
		}
}
