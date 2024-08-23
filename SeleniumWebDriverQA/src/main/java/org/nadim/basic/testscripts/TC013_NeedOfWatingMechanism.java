package org.nadim.basic.testscripts;


// In this program we will get NoSuchElementException
//so we can solve this problem using Waiting mechanism

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC013_NeedOfWatingMechanism {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://omayo.blogspot.com/");
		driver.findElement(By.className("dropbtn")).click();
		
		//Thread.sleep(30000);
		driver.findElement(By.linkText("Flipkart")).click();
		
		driver.close();

	}

}
