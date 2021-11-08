package com.library.test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.library.bean.Customer;

public class CustomerMethodFirstName {

    Customer customer=new Customer();
    
    @Before
	 public void customertest() {
    	customer.setFirstName("Duke");
	 }
    
	@Test
	public void testgetFirstName() {
		String actual=customer.getFirstName();
		String expected= "Duke";
		assertEquals(expected, actual);
	}
		  
		@Test
		public void testsetFirstName() {
			String actual=customer.getFirstName();
			String expected= "Duke";
			assertEquals(expected, actual);
		}

}
