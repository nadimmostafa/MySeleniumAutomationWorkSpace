package org.nadim.dropdown.testscripts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TC003_TraditionalMultiSelectDropdown {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/");
		
		Select select = new Select(driver.findElement(By.id("multiselect1")));
		select.selectByVisibleText("Volvo");
		select.selectByVisibleText("Swift");
		select.selectByVisibleText("Audi");
		
		Thread.sleep(2000);
		//retrieve all selected value
		List<WebElement> allSelectedOptions = select.getAllSelectedOptions();
		for(WebElement allOption:allSelectedOptions) {
			System.out.println(allOption.getText());
		}
		
		
		// Deselect the select item 
		select.deselectByValue("swiftx");
		Thread.sleep(2000);
		driver.close();
	}

}
