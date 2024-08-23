package org.nadim.calender.testscripts;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC002_HandlingCalenderUsingJavaScriptExecutor {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://seleniumpractise.blogspot.com/2016/08/how-to-handle-calendar-in-selenium.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		WebElement datePicker = driver.findElement(By.id("datepicker"));
		datePicker.click();

		JavascriptExecutor je = ((JavascriptExecutor) driver);
		try {
			je.executeScript("arguments[0].value='17-01-2025'", datePicker);
			Thread.sleep(2000);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			driver.close();
		}

	}

}
