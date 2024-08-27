package org.nadim.dataprovider;

import org.testng.annotations.DataProvider;

public class TestInputDataProvider {
	@DataProvider(name="security")
	public Object[][] getCredentials(){
		return new Object[][] {
			{"nadim","123"},{"mustak","345"},{"naim","567"}
		};
	}
}
