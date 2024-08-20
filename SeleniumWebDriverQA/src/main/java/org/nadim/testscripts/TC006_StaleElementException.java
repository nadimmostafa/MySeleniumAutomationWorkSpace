package org.nadim.testscripts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC006_StaleElementException {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://omayo.blogspot.com/");
		driver.manage().window().maximize();
		
		WebElement textField = driver.findElement(By.id("ta1"));
		textField.sendKeys("Nadim");
		
		Thread.sleep(2000);
		
		driver.findElement(By.id("link1")).click();
		Thread.sleep(2000);
		driver.navigate().back();
		
		driver.navigate().refresh();
		
		// here we get staleElement Exception
		//the webElement textFiled reference link is closed
		textField.sendKeys("Mostafa");
		Thread.sleep(2000);
		driver.close();
		

	}

}
