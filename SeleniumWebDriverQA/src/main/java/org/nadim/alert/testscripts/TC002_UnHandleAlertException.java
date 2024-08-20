package org.nadim.alert.testscripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC002_UnHandleAlertException {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");

		driver.findElement(By.xpath("//div[@class='example']//button[text()='Click for JS Alert']")).click();
		
		// If any alert is come to the main page then 
		//if we not handle the alert and try to access web element in web page then jvm throw Exception
		//here we will get unHandleAlertException
		driver.findElement(By.linkText("Elemental Selenium")).click();
	}

}
