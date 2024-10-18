package org.nadim.calender.testscripts;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC006_HandlingCalenderGuru99 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/");
		
		WebElement dateTimeElement = driver.findElement(By.name("bdaytime"));
		dateTimeElement.sendKeys("10081997"); //mm/dd/yyyy
		dateTimeElement.sendKeys(Keys.TAB);
		dateTimeElement.sendKeys("0530AM"); //min:sec:AM/PM

	}

}
