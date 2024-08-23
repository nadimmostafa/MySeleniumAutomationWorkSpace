package org.nadim.windinAndTab.testscripts;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC008_MultipleWindowsHandling {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://omayo.blogspot.com/");
		Thread.sleep(20000);
		String mainWindowId = driver.getWindowHandle();
		
		WebElement blogLink = driver.findElement(By.linkText("Blogger"));
		blogLink.click();
		Thread.sleep(20000);
		
		Set<String> windowHandles = driver.getWindowHandles();
	
		for(String windowId:windowHandles) {
			
			// condition for Switching from main window to child window
			driver.switchTo().window(windowId);
			String title="Blogger.com - Create a unique and beautiful blog easily.";
			
			String title2 = driver.getTitle();
			
			if(title.equals(title2)) {
				break;
			}
		}
		
		driver.findElement(By.xpath("//header[@class='hero--header']//a")).click();
		Thread.sleep(30000);
		driver.close();
		
		// switching from child window to main window
		driver.switchTo().window(mainWindowId);
		
		WebElement textField = driver.findElement(By.id("ta1"));
		textField.sendKeys("Nadim");
		Thread.sleep(20000);
		
		driver.close();
	}

}
