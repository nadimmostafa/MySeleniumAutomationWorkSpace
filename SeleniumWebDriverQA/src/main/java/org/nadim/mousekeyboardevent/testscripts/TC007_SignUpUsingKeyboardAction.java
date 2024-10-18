package org.nadim.mousekeyboardevent.testscripts;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class TC007_SignUpUsingKeyboardAction {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://login.yahoo.com/account/create");
		
		WebElement userName = driver.findElement(By.id("usernamereg-firstName"));
		
		Actions action = new Actions(driver);
		action.sendKeys(userName,"Nadim") //enter firstname
				//enter last name
				.keyDown(Keys.TAB)
				.sendKeys("Mostafa")
				.keyUp(Keys.TAB)
				//enter gmail
				.keyDown(Keys.TAB)
				.sendKeys("nadim6778")
				.keyUp(Keys.TAB)
				//enter password
				.keyDown(Keys.TAB)
				.sendKeys("12457e")
				.keyUp(Keys.TAB)
				//select month
				.keyDown(Keys.TAB)
				.keyDown(Keys.ARROW_DOWN)
				.keyDown(Keys.ARROW_DOWN)
				.keyUp(Keys.ARROW_DOWN)
				.keyUp(Keys.TAB)
				//select day
				.keyDown(Keys.TAB)
				.sendKeys("12")
				.keyUp(Keys.TAB)
				//select year
				.keyDown(Keys.TAB)
				.sendKeys("1992")
				.keyUp(Keys.TAB)
				//click on Next button using enter key
				.keyDown(Keys.ENTER)
				.pause(1000)
				.keyUp(Keys.ENTER)
				.build().perform();
		
		driver.close();

	}

}
