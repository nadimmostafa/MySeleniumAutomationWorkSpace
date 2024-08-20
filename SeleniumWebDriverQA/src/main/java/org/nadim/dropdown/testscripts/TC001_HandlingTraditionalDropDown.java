package org.nadim.dropdown.testscripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TC001_HandlingTraditionalDropDown {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/");
		
		WebElement dropdown = driver.findElement(By.id("drop1"));
		Select select = new Select(dropdown);
		select.selectByVisibleText("doc 3");
		
		driver.close();
	}

}
