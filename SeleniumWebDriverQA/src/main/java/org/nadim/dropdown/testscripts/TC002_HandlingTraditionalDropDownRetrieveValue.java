package org.nadim.dropdown.testscripts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TC002_HandlingTraditionalDropDownRetrieveValue {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/");
		
		WebElement dropdown = driver.findElement(By.id("drop1"));
		Select select = new Select(dropdown);
		select.selectByVisibleText("doc 3");
		
		WebElement firstSelectedOption = select.getFirstSelectedOption();
		System.out.println("First Selected Option: "+ firstSelectedOption.getText());
		
		List<WebElement> options = select.getOptions();
		
		for(WebElement option:options) {
			// retrieve all visible text in dropdown
			//System.out.println(option.getText());
			
			// Retrieve all value from dropdown
			System.out.println(option.getAttribute("value"));
		}
		driver.close();
	}

}
