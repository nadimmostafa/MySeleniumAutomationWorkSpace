package org.nadim.iframe.testsccripts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC004_HandlingFrameBasedOnIndex {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://docs.oracle.com/javase/8/docs/api/");
		
		// Find how many frames are available
		//List<WebElement> frames = driver.findElements(By.tagName("frame"));
		//System.out.println(frames.size());
		
		driver.switchTo().frame(2);
		int size = driver.findElements(By.linkText("Description")).size();
		WebElement description = driver.findElement(By.linkText("Description"));
		description.click();
		
		System.out.println(size);
		System.out.println(description.getText());
		
		Thread.sleep(2000);
		
		driver.close();
	}

}
