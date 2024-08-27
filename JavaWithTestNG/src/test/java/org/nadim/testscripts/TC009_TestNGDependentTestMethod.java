package org.nadim.testscripts;

import org.nadim.corejava.SumTwoNumbers;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TC009_TestNGDependentTestMethod {
	
	private SumTwoNumbers stn;
	
	@BeforeClass
	public void setUp() {
		System.out.println("Before all Test Methods");
		stn = new SumTwoNumbers();
	}
	
	@AfterClass
	public void cleanUp() {
		System.out.println("After all Test Methods");
	}
	
	//testMethod1 depend on testMethod2
	//if testMethod2 is fail then testMethod1 is skipped
	//if we want to run testMethod1 either testMethod2 is pass or fail then add attribute
	//alwaysRun=true
	@Test(dependsOnMethods= {"testMethod2"},alwaysRun=true)
	public void testMethod1() {
		System.out.println("Running Test(Dependent):: testMethod1");
	}
	
	@Test
	public void testMethod2() {
		System.out.println("Running Test(Dependent):: testMethod2");
		int actualResult = stn.sum(2, 5);
		Assert.assertEquals(actualResult, 6);
	}
	
	@Test(dependsOnMethods= {"testMethod1"})
	public void testMethod3() {
		System.out.println("Running Test(Dependent):: testMethod3");
	}
}
