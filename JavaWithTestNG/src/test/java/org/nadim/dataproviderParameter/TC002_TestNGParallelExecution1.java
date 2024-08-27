package org.nadim.dataproviderParameter;

import org.testng.annotations.Test;

public class TC002_TestNGParallelExecution1 {
	@Test
	public void testMethod() {
		System.out.println("Parallel-1 :: AAA");
	}

	@Test
	public void testMethod2() throws InterruptedException {
		Thread.sleep(4000);
		System.out.println("Parallel-1 :: BBB");
	}
}
