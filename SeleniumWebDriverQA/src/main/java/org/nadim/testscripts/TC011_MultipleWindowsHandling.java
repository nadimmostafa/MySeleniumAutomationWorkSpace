package org.nadim.testscripts;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC011_MultipleWindowsHandling {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.get("https://omayo.blogspot.com/");
		driver.manage().window().maximize();

		driver.findElement(By.linkText("Blogger")).click();
		// System.out.println(driver.getTitle());
		Thread.sleep(2000);
		driver.findElement(By.linkText("Open a popup window")).click();
		Thread.sleep(2000);

		
		// Switch to pop up window
		switchToWindow("New Window", driver);
		driver.manage().window().maximize();
		WebElement element = driver.findElement(By.tagName("h3"));
		System.out.println(element.getText());
		
		//Switch to blogger window
		switchToWindow("Blogger.com - Create a unique and beautiful blog easily.",driver);
		System.out.println(driver.getTitle());
		
		// switch to main window
		switchToWindow("",driver);
		Thread.sleep(3000);
		driver.findElement(By.id("ta1")).sendKeys(" Mostafa");
		
		driver.quit();
	}

	public static String switchToWindow(String title, WebDriver driver) {
		
		//if we add below line then remove method parameter Set<String> windowIds
		Set<String> windowHandles = driver.getWindowHandles();
		for (String windowId:windowHandles) {
			driver.switchTo().window(windowId);
			String title2 = driver.getTitle();
			if (title2.equals(title)) {
				break;
			}
		}
		return null;
	}

}
