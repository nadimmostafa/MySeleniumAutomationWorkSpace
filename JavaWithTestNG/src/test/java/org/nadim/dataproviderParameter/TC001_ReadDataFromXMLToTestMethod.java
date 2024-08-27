package org.nadim.dataproviderParameter;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TC001_ReadDataFromXMLToTestMethod {
	
	@BeforeClass
	@Parameters({"browser","platform"})
	public void beforeClass(String browser, String platform) {
		System.out.println("Before Class:: ");
		System.out.println("Browser is: "+browser+" and Platform is: "+platform);
	}
	
	@Test
	@Parameters({"language"})
	public void testMethod(String language) {
		System.out.println("Paltform Language is: "+language);
	}
}
