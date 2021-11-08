package com.library.test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.library.bean.Customer;

public class CustomerContactNumber {

Customer customer=new Customer();

    
    @Before
	 public void customertest() {
    	customer.setContact("+23378934");
	 }

	@Test
	public void testgetContact() {
		String actual=customer.getContact();
		String expected= "+23378934";
		assertEquals(expected, actual);
	}
		  
		@Test
		public void testsetContact() {
			String actual=customer.getContact();
			String expected= "+23378934";
			assertEquals(expected, actual);
		}

}
