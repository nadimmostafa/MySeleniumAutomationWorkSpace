package org.nadim.mousekeyboardevent.testscripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class TC006_DoubleClick {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://api.jquery.com/dblclick/");
		Thread.sleep(2000);
		driver.switchTo().frame(0);
		Thread.sleep(2000);
		WebElement doubleClick = driver.findElement(By.xpath("//div[@class='dbl']"));
		
		Actions action= new Actions(driver);
		action.doubleClick(doubleClick).perform();
		
		
	}

}
