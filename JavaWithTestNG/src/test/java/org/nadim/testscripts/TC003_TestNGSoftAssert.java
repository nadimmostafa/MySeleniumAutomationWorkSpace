package org.nadim.testscripts;

import org.nadim.corejava.SumTwoNumbers;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TC003_TestNGSoftAssert {
	SumTwoNumbers stn = new SumTwoNumbers();
	SoftAssert sa = new SoftAssert();

	@Test
	public void testMethod1() {
		System.out.println("Running Test -> testMethod1");
		int expectedResult = 7;
		int actualResult = stn.sum(2, 5);

		sa.assertEquals(actualResult, expectedResult);
		System.out.println("First Assertion");

		sa.assertEquals(actualResult, 6);
		System.out.println("Second Assertion");

		// if we do not add this below line then we can not find out which assertion is
		// pass and which is fail
		sa.assertAll();
	}
}
