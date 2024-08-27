package org.nadim.dataproviderParameter;

import org.testng.annotations.Test;

public class TC003_TestNGParallelExecution2 {
	@Test
	public void m() throws InterruptedException {
		Thread.sleep(4000);
		System.out.println("Parallel-2 :: CCC");
	}
	@Test
	public void m2() {
		System.out.println("Parallel-2 :: DDD");
	}
}
