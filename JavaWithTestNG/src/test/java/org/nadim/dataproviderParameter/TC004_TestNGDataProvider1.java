package org.nadim.dataproviderParameter;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TC004_TestNGDataProvider1 {
	
	@DataProvider(name="a")
	public String [] dataProvider() {
		return new String[] {
			"Nadim","Naim"
		};
	}
	
	@Test(dataProvider="a")
	public void testMethod(String name) {
		System.out.println("Name is: "+name);
	}
}
