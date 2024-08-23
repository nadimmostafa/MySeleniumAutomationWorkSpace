package org.nadim.basic.testscripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC003_CheckBoxIsSelected {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://omayo.blogspot.com");
		WebElement checkbox = driver.findElement(By.id("checkbox1"));
		
		if(checkbox.isSelected()) {
			System.out.println("Checkbox is Selected");
		}else {
			System.out.println("Checkbox is not selected");
		}
		
		driver.close();

	}

}
