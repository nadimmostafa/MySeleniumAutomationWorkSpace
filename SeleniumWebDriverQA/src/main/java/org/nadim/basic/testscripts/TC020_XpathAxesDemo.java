package org.nadim.basic.testscripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC020_XpathAxesDemo {

	public static void main(String[] args) {
		
		WebDriver driver  = new ChromeDriver();
		driver.get("https://www.hyrtutorials.com/p/add-padding-to-containers.html");
		
		driver.close();

	}

}
