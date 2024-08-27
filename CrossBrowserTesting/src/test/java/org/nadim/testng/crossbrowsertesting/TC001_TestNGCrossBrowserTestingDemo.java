package org.nadim.testng.crossbrowsertesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.phantomjs.PhantomJSDriver;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class TC001_TestNGCrossBrowserTestingDemo {

	private WebDriver driver;

	@Test
	public void chromeBrowser() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://183.82.103.245/nareshit/login.php");

		sleep(5);
		driver.close();
	}
	
	@Test
	public void firefoxBrowser() {
		driver = new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		System.out.println(driver.getTitle());
		sleep(6);
		driver.close();
	}
	@Test
	@Ignore
	public void phanthomJSBrowser() {
		driver = new PhantomJSDriver();
		driver.get("https://www.facebook.com/");
		System.out.println(driver.getTitle());
		sleep(6);
	}

	private void sleep(int i) {
		try {
			Thread.sleep(i * 1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
