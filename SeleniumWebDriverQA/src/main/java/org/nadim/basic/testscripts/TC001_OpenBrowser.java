package org.nadim.basic.testscripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC001_OpenBrowser {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		/*Options opt = driver.manage();
		Window window = opt.window();
		window.maximize();*/
		
		// Maximize the browser window
		driver.manage().window().maximize();
		
		//To navigate to a particular web page URL
		driver.get("https://tutorialsninja.com/demo");
		//driver.get("https://omayo.blogspot.com");
		
	}

}
