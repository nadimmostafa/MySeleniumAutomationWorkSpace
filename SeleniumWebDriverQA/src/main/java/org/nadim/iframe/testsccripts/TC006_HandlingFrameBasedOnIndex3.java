package org.nadim.iframe.testsccripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC006_HandlingFrameBasedOnIndex3 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://docs.oracle.com/javase/8/docs/api/");

		By description = By.linkText("Description");

		int indexOfFrame = findIndexOfFrame(driver, description);
		// driver.switchTo().defaultContent();
		// driver.switchTo().frame(indexOfFrame);
		WebElement text = driver.findElement(description);
		text.click();
		System.out.println(text.getText());
		Thread.sleep(2000);

		driver.close();
	}

	public static int findIndexOfFrame(WebDriver driver, By locator) {
		int index = 0;
		int size = driver.findElements(By.tagName("frame")).size();

		for (int i = 0; i < size; i++) {
			driver.switchTo().defaultContent();
			driver.switchTo().frame(i);
			int indexSize = driver.findElements(locator).size();

			if (indexSize > 0) {
				index = i;
			}
		}
		return index;
	}

}
