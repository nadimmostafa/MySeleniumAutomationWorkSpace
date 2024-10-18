package org.nadim.basic.testscripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TC001_OpenBrowser {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		//WebDriver fDriver = new FirefoxDriver();
		//WebDriver eDriver = new EdgeDriver();
		/*Options opt = driver.manage();
		Window window = opt.window();
		window.maximize();*/
		driver = new ChromeDriver();
		driver = new ChromeDriver();
		driver = new ChromeDriver();
		// Maximize the browser window
		//driver.manage().window().maximize();
		
		//To navigate to a particular web page URL
		//driver.get("https://tutorialsninja.com/demo");
		//driver.get("https://omayo.blogspot.com");
		
		System.out.println("Start");
		driver.get("https://www.google.com/");
		
		driver.close();
		
		System.out.println("End");
	
	}

}
