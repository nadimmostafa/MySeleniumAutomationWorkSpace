package org.nadim.windinAndTab.testscripts;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC010_MultipleWindowsHandling {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.get("https://omayo.blogspot.com/");
		driver.manage().window().maximize();
		String mainWindowId = driver.getWindowHandle();

		driver.findElement(By.linkText("Blogger")).click();
		// System.out.println(driver.getTitle());
		Thread.sleep(2000);
		driver.findElement(By.linkText("Open a popup window")).click();
		Thread.sleep(2000);

		Set<String> windowHandles = driver.getWindowHandles();
		
		// Switch to pop up window
		switchToWindow("New Window", windowHandles, driver);
		driver.manage().window().maximize();
		WebElement element = driver.findElement(By.tagName("h3"));
		System.out.println(element.getText());
		
		//Switch to blogger window
		switchToWindow("Blogger.com - Create a unique and beautiful blog easily.", windowHandles, driver);
		System.out.println(driver.getTitle());
		
		// switch to main window
		switchToWindow("", windowHandles, driver);
		Thread.sleep(3000);
		driver.findElement(By.id("ta1")).sendKeys(" Mostafa");
		
		driver.quit();
	}

	public static void switchToWindow(String title, Set<String> windowIds, WebDriver driver) {
		
		//if we add below line then remove method parameter Set<String> windowIds
		//Set<String> windowHandles = driver.getWindowHandles();
		for (String windowId : windowIds) {
			driver.switchTo().window(windowId);
			String title2 = driver.getTitle();
			if (title2.equals(title)) {
				break;
			}
		}
	}

}
