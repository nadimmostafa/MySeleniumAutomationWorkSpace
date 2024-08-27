package org.nadim.testscripts;

import org.nadim.corejava.SumTwoNumbers;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC002_TestNGHardAsserts {
	SumTwoNumbers stn = new SumTwoNumbers();
	
	@Test
	public void testMethod1() {
		System.out.println("Running Test -> testMethod1");
		int expectedResult = 7;
		int actualResult = stn.sum(2, 5);
		Assert.assertEquals(actualResult,expectedResult);
	}
	
	@Test
	public void testMethod2() {
		System.out.println("Running Test -> testMethod2");
		String expectedResult = "Nadim Mostafa";
		String actualResult = stn.addString("Nadim", "Mostafa");
		Assert.assertEquals(actualResult,expectedResult);
	}
	
	@Test
	public void testMethod3() {
		System.out.println("Running Test -> testMethod3");
		int [] expectedResult = {1,2,3,4};
		int [] actualResult = stn.getArray();
		Assert.assertEquals(actualResult,expectedResult);
	}
}
