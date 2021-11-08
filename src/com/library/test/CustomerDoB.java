package com.library.bean;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class CustomerDoB {

Customer customer=new Customer();

    
    @Before
	 public void customertest() {
    	customer.setDoB("20/12/2012");
	 }

	@Test
	public void testgetDoB() {
		String actual=customer.getDoB();
		String expected= "20/12/2012";
		assertEquals(expected, actual);
	}
		  
		@Test
		public void testsetDoB() {
			String actual=customer.getDoB();
			String expected= "20/12/2012";
			assertEquals(expected, actual);
		}


}
