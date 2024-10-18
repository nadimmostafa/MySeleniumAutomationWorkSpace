package org.nadim.mousekeyboardevent.testscripts;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class TC005_KeyBoardActions {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://login.yahoo.com/account/create");
		WebElement linkHelp = driver.findElement(By.xpath("//a[text()='Help']"));
		Thread.sleep(2000);
		//open a link on new tab
		Actions action = new Actions(driver);
		action.keyDown(Keys.CONTROL)
			  .click(linkHelp)
			  .keyUp(Keys.CONTROL)
			  .build().perform();
		Thread.sleep(2000);
		driver.close();
	}

}
