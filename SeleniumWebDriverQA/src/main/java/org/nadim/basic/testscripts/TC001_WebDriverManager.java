package org.nadim.basic.testscripts;

import org.openqa.selenium.WebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TC001_WebDriverManager {

	public void setUp() {
		WebDriver driver = WebDriverManager.chromedriver().create();
		driver.get("https://www.google.com/");
	}

}
