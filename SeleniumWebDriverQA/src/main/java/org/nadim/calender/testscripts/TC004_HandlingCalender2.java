package org.nadim.calender.testscripts;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC004_HandlingCalender2 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.path2usa.com/travel-companion");
		
		WebElement dateInputField = driver.findElement(By.id("form-field-travel_comp_date"));
		WebElement elementUptoScroll = driver.findElement(By.xpath("//div[@data-id='7a51525']"));
		
		JavascriptExecutor je = ((JavascriptExecutor)driver);
		je.executeScript("arguments[0].scrollIntoView()", elementUptoScroll);
		Thread.sleep(2000);
		dateInputField.click();
		
		
		Thread.sleep(2000);
		driver.close();
	}

}
