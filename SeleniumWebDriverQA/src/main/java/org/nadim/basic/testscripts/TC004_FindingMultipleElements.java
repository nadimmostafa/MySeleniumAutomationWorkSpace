package org.nadim.basic.testscripts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC004_FindingMultipleElements {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://omayo.blogspot.com");

		List<WebElement> elements = driver.findElements(By.xpath("//select[@id='multiselect1']/option"));
		
		for(WebElement element:elements) {
			System.out.println(element.getText());
		}
		
		driver.close();
	}

}
