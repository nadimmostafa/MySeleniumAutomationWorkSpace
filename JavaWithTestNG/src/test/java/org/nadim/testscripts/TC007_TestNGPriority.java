package org.nadim.testscripts;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TC007_TestNGPriority {
	
	@BeforeClass
	public void setUp() {
		System.out.println("Before Class:: Execute before all Test Methods");
	}
	
	@AfterClass
	public void cleanUp() {
		System.out.println("After Class:: Execute After all Test Methods");
	}
	
	@Test(priority=3)
	public void testMethod1() {
		System.out.println("Running Test -> testMethod1");
	}
	
	@Test(priority=8)
	public void testMethod2() {
		System.out.println("Running Test -> testMethod2");
	}
	
	@Test(priority=7)
	public void testMethod3() {
		System.out.println("Running Test -> testMethod3");
	}
}
