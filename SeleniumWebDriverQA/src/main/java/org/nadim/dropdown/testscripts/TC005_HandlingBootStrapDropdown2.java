package org.nadim.dropdown.testscripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC005_HandlingBootStrapDropdown2 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.bstackdemo.com/");
		driver.findElement(By.xpath("//select")).click();
		
		String item="Lowest to highest";
		driver.findElement(By.xpath("//select/option[contains(text(),'"+item+"')]")).click();
	}

}
