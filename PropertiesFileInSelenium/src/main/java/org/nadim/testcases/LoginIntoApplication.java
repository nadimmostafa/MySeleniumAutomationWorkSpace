package org.nadim.testcases;

import java.util.Properties;

import org.nadim.util.ReadDataFromPropertiesFile;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginIntoApplication {
	public static void main(String[] args) throws InterruptedException {
		ReadDataFromPropertiesFile r = new ReadDataFromPropertiesFile();
		Properties properties = r.readPropertiesData();
		
		WebDriver driver = new ChromeDriver();
		driver.get(properties.getProperty("website.url"));
		driver.manage().window().maximize();
		
		driver.findElement(By.name("username")).sendKeys(properties.getProperty("login-username"));
		driver.findElement(By.name("password")).sendKeys(properties.getProperty("login-password"));
		driver.findElement(By.id("submit")).click();
		
		Thread.sleep(3000);
		driver.close();
	}
}
