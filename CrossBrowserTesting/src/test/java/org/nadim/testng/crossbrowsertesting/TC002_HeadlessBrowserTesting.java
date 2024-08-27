package org.nadim.testng.crossbrowsertesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.annotations.Test;

public class TC002_HeadlessBrowserTesting {
	
	private WebDriver driver;
	
	@Test
	public void chromeBrowser() {
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--headless");
		driver = new ChromeDriver(option);
		driver.get("https://www.facebook.com/");
		System.out.println(driver.getTitle());
		
		sleep(5);
		driver.close();
	}

	@Test
	public void firefoxBrowser() {
		FirefoxOptions option = new FirefoxOptions();
		option.addArguments("headless");
		driver = new FirefoxDriver(option);
		driver.get("https://www.youtube.com/");
		System.out.println(driver.getTitle());
		
		sleep(5);
		driver.close();
	}
	private void sleep(int i) {
		try {
			Thread.sleep(i*1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
