package org.nadim.dataprovider;

import org.testng.annotations.DataProvider;

public class DataProviderClass {
	//providing different combination of credential access data
	//as follow order (user,pwd,fail/pass)
	
	@DataProvider(name="loginData")
	public Object[][] getCredentialData(){
		return new Object[][] {
			{"student","Password123",true},
			//{"admin", false},
			//{"","admin123",false},
			{"student","admin234",false}
		};
	}
}
