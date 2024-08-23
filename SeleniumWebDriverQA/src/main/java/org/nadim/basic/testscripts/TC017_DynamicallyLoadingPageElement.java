package org.nadim.basic.testscripts;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TC017_DynamicallyLoadingPageElement {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/dynamic_loading/1");
		
		driver.findElement(By.xpath("//div[@id=\"start\"]/button")).click();
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		WebElement text = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id=\"finish\"]/h4")));
		String txt = text.getText();
		
		System.out.println(txt);
		
		driver.close();
		
	}

}
