package org.nadim.testscripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC012_OpenNewTabOrWindow {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/");
		Thread.sleep(30000);
		
		//open new tab
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://selenium143.blogspot.com/");
		Thread.sleep(30000);
		
		//open new window
		driver.switchTo().newWindow(WindowType.WINDOW);
		driver.get("https://www.blogger.com/");
		Thread.sleep(30000);
		
		driver.close();
	}

}
