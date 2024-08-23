package org.nadim.calender.testscripts;

import java.time.Duration;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TC001_HandlingCalender {

	public static void main(String[] args) {
		
		String expectedDate = "01-12-1997";
		LocalDate localdate = generatedDateFormat(expectedDate);
		String expectedMonth = localdate.getMonth().toString();
		String expectedDay = String.valueOf(localdate.getDayOfMonth());
		String expectedYear = String.valueOf(localdate.getYear());
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://seleniumpractise.blogspot.com/2016/08/how-to-handle-calendar-in-selenium.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.findElement(By.id("datepicker")).click();
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("ui-datepicker-div")));
		
		
		String month = driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
		String year = driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();
		
		while(!(expectedMonth.equalsIgnoreCase(month) && expectedYear.equals(year))) {
			driver.findElement(By.xpath("//a[@title='Prev']")).click();
			month = driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
			year = driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();
		}
		
		String d = "//td[@data-handler='selectDay']/a[text()='"+expectedDay+"']";
		driver.findElement(By.xpath(d)).click();
		
		driver.close();
	}
	
	public static LocalDate generatedDateFormat(String date) {
		DateTimeFormatter f = DateTimeFormatter.ofPattern("dd-MM-yyyy");
		LocalDate localDate = LocalDate.parse(date,f);
		return localDate;
	}

}
