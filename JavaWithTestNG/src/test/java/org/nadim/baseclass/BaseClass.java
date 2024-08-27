package org.nadim.baseclass;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

public class BaseClass {

	@BeforeSuite
	public void beforeSuite() {
		System.out.println("Base Class :: Before Suite");
	}
	@AfterSuite
	public void afterSuite() {
		System.out.println("Base Class :: After Suite");
	}

	@BeforeClass
	public void beforeClass() {
		System.out.println("Base Class:: Before class execute for Every Class\n");
	}
	
	@AfterClass
	public void afterClass() {
		System.out.println("Base Class:: After class execute for Every Class");
	}
}
