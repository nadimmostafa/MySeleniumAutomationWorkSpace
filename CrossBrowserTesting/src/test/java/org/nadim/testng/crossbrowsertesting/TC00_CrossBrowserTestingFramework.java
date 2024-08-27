package org.nadim.testng.crossbrowsertesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TC00_CrossBrowserTestingFramework {

	private WebDriver driver=null;

	@BeforeTest
	// read data from xml file
	@Parameters({ "browser" })
	public void setUp(@Optional("chrome") String browser) {
		if (browser.equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();
		} else if (browser.equalsIgnoreCase("firefox")) {
			driver = new FirefoxDriver();
		} else {
			throw new RuntimeException("Does not Support Browser " + browser);
		}
	}

	@Test
	public void launchingUrl() {
		driver.get("https://www.facebook.com/");
		System.out.println(driver.getTitle());
		//sleep(5);
	}

	@AfterTest
	public void cleanUp() {
		driver.close();
	}

	private void sleep(int i) {
		try {
			Thread.sleep(i * 1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
