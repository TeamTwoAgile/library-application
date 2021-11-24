package com.library.test;

import static org.junit.Assert.assertEquals;

import java.sql.SQLException;

import org.junit.Before;
import org.junit.Test;

import com.library.bean.Customer;
import com.library.controller.UserFetch;


public class CustomerLoginTest {
	private static final boolean val=false;
	private UserFetch userfetch;
	
	@Before
	public void setUp() {
		userfetch = new UserFetch();
	}
	
	@Test
	public void testcustomerlogin001() {
		
		Customer customer = new Customer();
		customer.setUsername("xyz");
		customer.setPassword("xyz");
		boolean validate= val;
		
		try {
			validate = userfetch.validate(customer);
		}catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace(System.err);
		}

		assertEquals(true, validate);
		
		}
	
	
	
	@Test
	public void testcustomerlogin002() {
		
		Customer customer = new Customer();
		customer.setUsername("xyz");
		boolean validate=val;
		try {
			validate = userfetch.validate(customer);
		}catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace(System.err);
		}
		
		assertEquals(false, validate);
		}
	
	
	@Test
	public void testcustomerlogin003() {
		
		Customer customer = new Customer();
		customer.setPassword("xyz");
		boolean validate=val;
		try {
			validate = userfetch.validate(customer);
		}catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace(System.err);
		}
		
		assertEquals(false, validate);
		}
	
	@Test
	public void testcustomerlogin004() {
		
		Customer customer = new Customer();
		boolean validate=val;
		try {
			validate = userfetch.validate(customer);
		}catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace(System.err);
		}
		
		assertEquals(false, validate);
		}
	
	
}
	

	

	//CustomerDAO object
	
	//@Before create an instance of customerDAO
	
	//MethodS for testing. 

