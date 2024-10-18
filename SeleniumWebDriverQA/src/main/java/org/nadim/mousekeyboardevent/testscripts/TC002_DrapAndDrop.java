package org.nadim.mousekeyboardevent.testscripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class TC002_DrapAndDrop {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/droppable/");
		
		WebElement iframe = driver.findElement(By.tagName("iframe"));
		driver.switchTo().frame(iframe);
		
		WebElement srcDraggable = driver.findElement(By.id("draggable"));
		WebElement destinationDroppable = driver.findElement(By.id("droppable"));
		
		Actions action = new Actions(driver);
		/*
		 * action.clickAndHold(srcDraggable) 
		 * 		 .pause(2000) 
		 * 		 .release(destinationDroppable)
		 * 		 .perform();
		 */
		action.clickAndHold(srcDraggable)
			  .pause(1000)
			  .moveToElement(destinationDroppable)
			  .pause(1000)
			  .release()
			  .build()
			  .perform();
		
	}

}
