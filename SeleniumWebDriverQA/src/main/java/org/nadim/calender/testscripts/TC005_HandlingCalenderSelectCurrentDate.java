package org.nadim.calender.testscripts;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC005_HandlingCalenderSelectCurrentDate {

	public static void main(String[] args) throws InterruptedException {
		String myDate = "29-10-2024";

		DateTimeFormatter f = DateTimeFormatter.ofPattern("dd-MM-yyyy");
		LocalDate localDate = LocalDate.parse(myDate, f);
		String expectedMonth = localDate.getMonth().toString();
		int expectedYear = localDate.getYear();
		int expectedDay = localDate.getDayOfMonth();

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.path2usa.com/travel-companion");

		WebElement dateInputField = driver.findElement(By.id("form-field-travel_comp_date"));
		WebElement elementUptoScroll = driver.findElement(By.xpath("//div[@data-id='7a51525']"));

		JavascriptExecutor je = ((JavascriptExecutor) driver);
		je.executeScript("arguments[0].scrollIntoView()", elementUptoScroll);
		Thread.sleep(2000);
		dateInputField.click();

		// Retrieve Current month and year
		String currentMonth = driver.findElement(By.xpath("//span[@class='cur-month']")).getText();
		
		WebElement year = driver.findElement(By.xpath("//input[@class='numInput cur-year']"));
		String currentYear = year.getAttribute("min");
		int cYear = Integer.parseInt(currentYear);
		
		System.out.println(cYear);
		
		while (!(expectedMonth.equalsIgnoreCase(currentMonth))) {
			driver.findElement(By.xpath("//span[@class='flatpickr-next-month']")).click();
			Thread.sleep(1000);
			currentMonth = driver.findElement(By.xpath("//span[@class='cur-month']")).getText();
		}

		while (expectedYear!= cYear) {
			driver.findElement(By.xpath("//span[@class='arrowUp']")).click();
			Thread.sleep(1000);
			cYear++;
			System.out.println(cYear);
		}
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//span[@class='flatpickr-day '])["+expectedDay+"]")).click();
		
		Thread.sleep(3000);
		driver.close();
	}

}
