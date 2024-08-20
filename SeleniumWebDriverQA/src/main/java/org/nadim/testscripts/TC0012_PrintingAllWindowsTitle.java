package org.nadim.testscripts;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC0012_PrintingAllWindowsTitle {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://omayo.blogspot.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		driver.findElement(By.linkText("Blogger")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.linkText("Open a popup window")).click();
		Thread.sleep(3000);
		
		Set<String> windowHandles = driver.getWindowHandles();
		
		for(String wId:windowHandles) {
			driver.switchTo().window(wId);
			
			System.out.println(driver.getTitle());
		}
	}

}
