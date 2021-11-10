package com.library.test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.library.bean.Customer;

public class CustomerPassword {

Customer customer=new Customer();

    
    @Before
	 public void customertest() {
    	customer.setPassword("@123Wa");
	 }

	@Test
	public void testgetPassword() {
		String actual=customer.getPassword();
		String expected= "@123Wa";
		assertEquals(expected, actual);
	}
		  
		@Test
		public void testsetPassword() {
			String actual=customer.getPassword();
			String expected= "@123Wa";
			assertEquals(expected, actual);
		}


}
