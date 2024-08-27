package org.nadim.testscripts;

import org.nadim.corejava.SumTwoNumbers;
import org.testng.annotations.Test;

public class TC001_SumTwoNumbers {
	@Test
	public void testMethod1() {
		SumTwoNumbers stn = new SumTwoNumbers();
		stn.sum(1, 9);
		System.out.println("Running Test -> testMethod1");
	}

	@Test
	public void testMethod2() {
		System.out.println("Running Test -> testMethod2");
	}

	@Test
	public void testMethod3() {
		System.out.println("Running Test -> testMethod3");
	}
}
