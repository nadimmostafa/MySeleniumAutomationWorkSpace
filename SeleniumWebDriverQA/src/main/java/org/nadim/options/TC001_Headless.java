package org.nadim.options;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class TC001_Headless {

	public static void main(String[] args) {
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--headless=new"); //new
		//option.addArguments("--headless"); //work
		//option.SetHeadless(true); // not working
		WebDriver driver = new ChromeDriver(option);
		driver.get("https://www.google.com");
		
		String title = driver.getTitle();
		System.out.println(title);
		driver.close();
	} 

}
