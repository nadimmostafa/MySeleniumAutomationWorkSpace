package org.nadim.alert.testscripts;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.TargetLocator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TC001_HandlingInformationAlert {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");

		driver.findElement(By.xpath("//div[@class='example']//button[text()='Click for JS Alert']")).click();

		// Wait util alert is not present in the web page
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.alertIsPresent());

		// When alert is present then switch to alert
		TargetLocator switchTo = driver.switchTo();
		Alert alert = switchTo.alert();

		// Fetch the alert text
		String txt = alert.getText();
		System.out.println(txt);

		// Confirm the alert
		alert.accept();

		// Switch to main page from Alert but not mandatory
		//driver.switchTo().defaultContent();
		
		WebElement resultTxt = driver.findElement(By.id("result"));
		if (resultTxt.isDisplayed()) {
			System.out.println(resultTxt.getText());
		}
		
		driver.close();

	}

}
