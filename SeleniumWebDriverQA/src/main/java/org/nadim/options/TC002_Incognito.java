package org.nadim.options;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class TC002_Incognito {

	public static void main(String[] args) {
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--incognito");
		WebDriver driver = new ChromeDriver(option);
		driver.get("https://www.google.com");
		String title = driver.getTitle();
		System.out.println(title);
		driver.close();
	}

}
