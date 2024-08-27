package org.nadim.testscripts;

import org.nadim.baseclass.BaseClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TC004_TestNG_BeforeAndAfterMethod extends BaseClass {
	
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("@BeforeMethod annotated Method will execute before, for every @Test Method");
	}
	
	@AfterMethod
	public void afterMethod() {
		System.out.println("@AfterMethod annotated Method will execute after, for every @Test Method\n");
	}
	
	@Test
	public void testMethod1() {
		System.out.println("Running Test -> testMethod1");
	}
	
	@Test
	public void testMethod2() {
		System.out.println("Running Test -> testMethod2");
	}
}
