package org.nadim.basic.testscripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC002_CheckEnabledOrDisabledElement {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com");
		WebElement button = driver.findElement(By.id("but1"));
		
		if(button.isEnabled()) {
			System.out.println("Button is Enabled");
		}else {
			System.out.println("Button is Disabled");
		}
		
		driver.close();
	}

}
