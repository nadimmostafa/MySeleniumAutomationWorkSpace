package org.nadim.testscripts;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TC008_TestNGGroupTesting {
	@BeforeClass(alwaysRun=true)
	public void setUp() {
		System.out.println("Before Class:: Execute before all Test Methods");
	}
	
	@AfterClass(alwaysRun=true)
	public void cleanUp() {
		System.out.println("After Class:: Execute After all Test Methods");
	}
	
	@Test(groups= {"re-testing","smoke-testing"})
	public void testMethod1() {
		System.out.println("Running Test -> testMethod1");
	}
	
	@Test(groups= {"regration-testing","smoke-testing","re-testing"})
	public void testMethod2() {
		System.out.println("Running Test -> testMethod2");
	}
	
	@Test(groups= {"monky-testing"})
	public void testMethod3() {
		System.out.println("Running Test -> testMethod3");
	}
}
