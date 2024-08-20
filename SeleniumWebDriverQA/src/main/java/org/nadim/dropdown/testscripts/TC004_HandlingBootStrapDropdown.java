package org.nadim.dropdown.testscripts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC004_HandlingBootStrapDropdown {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.bstackdemo.com/");
		driver.findElement(By.xpath("//select")).click();
		
		String item="Lowest to highest";
		List<WebElement> elements = driver.findElements(By.cssSelector("select option"));
		
		for(WebElement element:elements) {
			if(element.getText().equals(item)) {
				element.click();
			}
		}

	}

}
