package org.nadim.testscripts;

import org.nadim.baseclass.BaseClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TC005_TestNG_BeforeAndAfterClass extends BaseClass{
	
	@BeforeClass
	public void beforeClas() {
		System.out.println("Execute only once before All Methods Execution");
	}
	
	@AfterClass
	public void afterClas() {
		System.out.println("Execute only once after All Methods Execution\n");
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
