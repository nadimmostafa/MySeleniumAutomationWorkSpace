package org.nadim.windinAndTab.testscripts;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC012_OpenNewTabOrWindow {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/");
		Thread.sleep(3000);
		
		//open new tab
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://selenium143.blogspot.com/");
		Thread.sleep(3000);
		
		//open new window
		driver.switchTo().newWindow(WindowType.WINDOW);
		driver.get("https://www.blogger.com/");
		Thread.sleep(3000);
		
		Set<String> windowHandles = driver.getWindowHandles();
		System.out.println(windowHandles);
		
		List<String> list = new ArrayList<>(windowHandles);
		//switch to parent window
		
		driver.switchTo().window(list.get(0));
		System.out.println("Parent "+driver.getTitle());
		
		driver.switchTo().window(list.get(1));
		System.out.println("First Child "+ driver.getTitle());
		
		//driver.close();
		driver.quit();
	}

}
