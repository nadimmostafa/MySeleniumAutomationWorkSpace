package org.nadim.dropdown.testscripts;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class TC008_HandlingAutoSuggestionDropdownUsingActionsClass_2 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");

		//driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));
		searchBox.click();
		searchBox.sendKeys("l");
		
		Actions action = new Actions(driver);
		action.pause(Duration.ofSeconds(2))
		.moveToElement(searchBox)
		.sendKeys(Keys.ARROW_DOWN)
		.sendKeys(Keys.ARROW_DOWN)
		.sendKeys(Keys.ARROW_DOWN)
		.sendKeys(Keys.ARROW_DOWN)
		.sendKeys(Keys.ENTER)
		.build().perform();
		
		Thread.sleep(2000);
		driver.close();
	}

}
