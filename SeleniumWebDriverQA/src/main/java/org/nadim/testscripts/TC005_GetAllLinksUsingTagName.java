package org.nadim.testscripts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WrapsElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC005_GetAllLinksUsingTagName {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://tutorialsninja.com/demo");
		
		List<WebElement> elements = driver.findElements(By.tagName("a"));
		
		System.out.println(elements.size());
		for(WebElement element:elements) {
			System.out.println(element.getText());
		}
		
		driver.close();

	}

}
