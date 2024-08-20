package org.nadim.testscripts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC007_StaleElementExceptionSolution {

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
		
		//re-assign the reference variable textField
		textField = driver.findElement(By.id("ta1"));
		textField.sendKeys("Mostafa");
		Thread.sleep(2000);
		driver.close();
		

	}

}
