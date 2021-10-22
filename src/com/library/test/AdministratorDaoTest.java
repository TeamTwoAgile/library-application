package com.library.test;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import com.library.bean.Administrator;
import com.library.dao.AdministratorDao;
import com.library.exception.BaseException;

public class AdministratorDaoTest {
	private AdministratorDao administratorDao;

	@Before
	public void setUp() {
		administratorDao = new AdministratorDao();
	}

	/**
	 * input : userName,password,email output : expect: pass test
	 */
	@Test
	public void testRegisterAdministrator001() {
		Administrator administrator = new Administrator();
		administrator.setUserName("tom");
		administrator.setPassword("123");
		administrator.setEmail("tom@gmail.com");
		int registerAdministrator = 0;

		try {
			registerAdministrator = administratorDao.registerAdministrator(administrator);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (BaseException e) {
			// TODO Auto-generated catch block

			e.printStackTrace();
		}

		assertEquals(1, registerAdministrator);

	}

	/**
	 * 
	 */
	@Test
	public void testRegisterAdministrator002() {
		Administrator administrator = new Administrator();
		administrator.setPassword("123");
		administrator.setEmail("tom@gmail.com");

		try {
			administratorDao.registerAdministrator(administrator);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (BaseException e) {
			// TODO Auto-generated catch block
			assertEquals("Administrator's userName should not be null", e.getMsg());
			e.printStackTrace();
		}

	}

	/**
	 * 
	 */
	@Test
	public void testRegisterAdministrator003() {
		Administrator administrator = new Administrator();
		administrator.setUserName("tom");
		administrator.setEmail("tom@gmail.com");
		try {
			administratorDao.registerAdministrator(administrator);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (BaseException e) {
			// TODO Auto-generated catch block
			assertEquals("Administrator's password should not be null", e.getMsg());
			e.printStackTrace();
		}

	}

	/**
	 * 
	 */
	@Test
	public void testRegisterAdministrator004() {
		Administrator administrator = new Administrator();
		administrator.setUserName("tom");
		administrator.setPassword("123");
		try {
			administratorDao.registerAdministrator(administrator);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (BaseException e) {
			// TODO Auto-generated catch block
			assertEquals("Administrator's email should not be null", e.getMsg());
			e.printStackTrace();
		}

	}
}
