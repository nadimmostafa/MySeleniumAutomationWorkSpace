package org.nadim.testscripts;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TC010_TestNG_TestMethodDisabledTimeout {
	
	@BeforeClass
	public void beforeClass() {
		System.out.println("Execute Before all methods execution");
	}
	
	@AfterClass
	public void afterClass() {
		System.out.println("Execute After all methods execution");
	}
	
	@Test(enabled=true)
	public void testMethod1() {
		System.out.println("Running Test -> TestMethod1");
	}
	
	@Test(timeOut=1000)
	public void testMethod2() throws InterruptedException {
		System.out.println("Running Test -> TestMethod2");
		Thread.sleep(2000);
	}
}
