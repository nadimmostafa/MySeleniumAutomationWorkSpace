package org.nadim.testscripts;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC009_MultipleWindowsHandling {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.get("https://omayo.blogspot.com/");
		driver.manage().window().maximize();
		String mainWindowId = driver.getWindowHandle();

		driver.findElement(By.linkText("Blogger")).click();
		// System.out.println(driver.getTitle());
		Thread.sleep(2000);

		Set<String> windowHandles = driver.getWindowHandles();
		String blogWindow = null;

		for (String windowId : windowHandles) {

			if (!windowId.equals(mainWindowId)) {
				blogWindow = windowId;
				break;
			}
		}

		driver.findElement(By.linkText("Open a popup window")).click();
		Thread.sleep(2000);

		Set<String> windowHandles2 = driver.getWindowHandles();
		String popUpWindowId = null;

		for (String w : windowHandles2) {
			if (!w.equals(mainWindowId) || !w.equals(blogWindow)) {
				popUpWindowId = w;
				break;
			}
		}

		// Switch from main window to blogger window
		driver.switchTo().window(blogWindow);
		System.out.println(driver.getTitle());

		// Switch from blogger window to Main window
		driver.switchTo().window(mainWindowId);
		driver.findElement(By.id("ta1")).sendKeys("Nadim");
		Thread.sleep(2000);

		// Switch from Main window to popup window
		driver.switchTo().window(popUpWindowId);
		driver.manage().window().maximize();
		Thread.sleep(3000);
		WebElement element = driver.findElement(By.tagName("h3"));
		System.out.println(element.getText());

		// Switch from popup window to Main window
		driver.switchTo().window(mainWindowId);
		driver.findElement(By.id("ta1")).sendKeys(" Mostafa");
		Thread.sleep(2000);
		
		driver.quit();
	}

}
