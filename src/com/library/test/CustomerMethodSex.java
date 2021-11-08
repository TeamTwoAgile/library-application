package com.library.test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.library.bean.Customer;

public class CustomerMethodSex {

Customer customer=new Customer();

    
    @Before
	 public void customertest() {
    	customer.setSex("male");
	 }

	@Test
	public void testgetSex() {
		String actual=customer.getSex();
		String expected= "male";
		assertEquals(expected, actual);
	}
		  
		@Test
		public void testsetSex() {
			String actual=customer.getSex();
			String expected= "male";
			assertEquals(expected, actual);
		}


}
