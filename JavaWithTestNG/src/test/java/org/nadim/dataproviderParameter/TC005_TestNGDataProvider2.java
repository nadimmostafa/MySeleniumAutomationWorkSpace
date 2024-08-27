package org.nadim.dataproviderParameter;

import org.nadim.dataprovider.TestInputDataProvider;
import org.testng.annotations.Test;

public class TC005_TestNGDataProvider2 {
	@Test(dataProvider="security", dataProviderClass=TestInputDataProvider.class)
	public void testCredential(String userName, String pwd) {
		System.out.println("User Name: "+userName);
		System.out.println("Password: "+pwd);
	}
}
