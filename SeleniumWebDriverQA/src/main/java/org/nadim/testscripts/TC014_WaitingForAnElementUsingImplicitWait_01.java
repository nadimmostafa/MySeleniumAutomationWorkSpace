package org.nadim.testscripts;

// Waiting for an element to be display on the web page

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC014_WaitingForAnElementUsingImplicitWait_01 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.className("dropbtn")).click();
		
		driver.findElement(By.linkText("Flipkart")).click();
		
		//For below line we will get NoSuchElementException
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.close();
	}

}
