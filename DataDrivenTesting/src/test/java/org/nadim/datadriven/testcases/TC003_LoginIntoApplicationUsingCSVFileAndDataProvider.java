package org.nadim.datadriven.testcases;

import org.nadim.dataprovider.CSVDataProvierClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TC003_LoginIntoApplicationUsingCSVFileAndDataProvider {
	private WebDriver driver = null;
	String expectedResult = null;
	String actualResult = null;

	@BeforeClass
	public void setUp() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

	@Test(dataProvider = "csv-data-provider", dataProviderClass = CSVDataProvierClass.class)
	public void login(String userName, String pwd, String isValid1) throws InterruptedException {
		
		//convert String to boolean
		boolean isValid = Boolean.valueOf(isValid1);
		
		driver.get("https://practicetestautomation.com/practice-test-login/");
		driver.findElement(By.name("username")).sendKeys(userName);
		Thread.sleep(2000);
		driver.findElement(By.name("password")).sendKeys(pwd);
		Thread.sleep(2000);
		driver.findElement(By.id("submit")).click();
		Thread.sleep(3000);

		if (isValid) {
			expectedResult = "Logged In Successfully";
			actualResult = driver.findElement(By.className("post-title")).getText();
			Assert.assertEquals(actualResult, expectedResult);
		} else {
			expectedResult = driver.findElement(By.className("show")).getText();
			actualResult = "Your password is invalid!";
			Assert.assertEquals(actualResult, expectedResult);
		}
	}

	@AfterClass
	public void cleanUp() {
		driver.close();
	}
}
