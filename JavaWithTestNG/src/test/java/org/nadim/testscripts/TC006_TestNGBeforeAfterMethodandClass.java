package org.nadim.testscripts;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TC006_TestNGBeforeAfterMethodandClass {
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("@BeforeMethod annotated Method will execute before, for every @Test Method");
	}

	@AfterMethod
	public void afterMethod() {
		System.out.println("@AfterMethod annotated Method will execute after, for every @Test Method\n");
	}

	@BeforeClass
	public void beforeClass() {
		System.out.println("Execute only once before All Methods Execution");
	}

	@AfterClass
	public void afterClass() {
		System.out.println("Execute only once after All Methods Execution");
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
