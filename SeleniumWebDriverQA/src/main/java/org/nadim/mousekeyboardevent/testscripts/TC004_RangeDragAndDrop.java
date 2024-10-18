package org.nadim.mousekeyboardevent.testscripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class TC004_RangeDragAndDrop {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/slider/");
		Thread.sleep(2000);
		
		driver.switchTo().frame(0);
		WebElement rangeSlider = driver.findElement(By.xpath("//div[@id='slider']/span"));
		
		Actions action = new Actions(driver);
		action.dragAndDropBy(rangeSlider, 30, 0).perform();
	}

}
