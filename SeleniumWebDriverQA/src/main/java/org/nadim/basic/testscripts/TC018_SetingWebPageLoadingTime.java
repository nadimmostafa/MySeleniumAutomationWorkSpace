package org.nadim.basic.testscripts;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//suppose My web site home page takes 4 seconds to load if we set explicitly time limit to 2 seconds
// then we will get TimeoutExecption
public class TC018_SetingWebPageLoadingTime {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		driver.get("https://omayo.blogspot.com/");
		driver.close();
	}

}
