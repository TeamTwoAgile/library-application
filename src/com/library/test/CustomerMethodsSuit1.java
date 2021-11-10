package com.library.bean;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ CustomerMethodFirstName.class, CustomerMethodLastName.class, CustomerMethodSex.class,
		CustomerMethodTitle.class, CostomerMethodAddress.class, CustomerAddressMethodConcat.class })
public class CustomerMethodsSuit1 {

}
