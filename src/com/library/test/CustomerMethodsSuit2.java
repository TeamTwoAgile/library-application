package com.library.test;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ CustomerCardDetails.class, CustomerContactNumber.class, CustomerDoB.class, CustomerPassword.class,
		CustomerUsername.class })
public class CustomerMethodsSuit2 {

}
