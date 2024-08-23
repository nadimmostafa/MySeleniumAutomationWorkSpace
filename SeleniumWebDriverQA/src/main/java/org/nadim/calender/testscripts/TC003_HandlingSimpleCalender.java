package org.nadim.calender.testscripts;

import java.time.Duration;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TC003_HandlingSimpleCalender {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://seleniumpractise.blogspot.com/2016/08/how-to-handle-calendar-in-selenium.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		WebElement datePicker = driver.findElement(By.id("datepicker"));
		datePicker.sendKeys("08/22/2050");
		Thread.sleep(2000);
		datePicker.sendKeys(Keys.ENTER);
		
		Thread.sleep(2000);
		
		driver.close();
	}

}
