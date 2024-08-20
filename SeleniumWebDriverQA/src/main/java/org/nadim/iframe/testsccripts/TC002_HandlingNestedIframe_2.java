package org.nadim.iframe.testsccripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC002_HandlingNestedIframe_2 {

	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://letcode.in/frame");
		
		//Switching to first Frame 
		driver.switchTo().frame("firstFr");
		
		//Switching to inner frame
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='has-background-white']")));
		driver.findElement(By.name("email")).sendKeys("java26@gmail.com");
		driver.switchTo().defaultContent();
		
		driver.close();
	}

}
