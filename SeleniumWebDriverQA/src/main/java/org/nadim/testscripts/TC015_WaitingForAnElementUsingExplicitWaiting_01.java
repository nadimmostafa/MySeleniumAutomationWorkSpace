package org.nadim.testscripts;
import java.time.Duration;

//Waiting for an element to be display on the web page
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TC015_WaitingForAnElementUsingExplicitWaiting_01 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/");
		
		driver.findElement(By.className("dropbtn")).click();
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		WebElement clickAble = wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Flipkart")));
		clickAble.click();
		//driver.findElement(By.linkText("Flipkart")).click();
		
		driver.close();

	}

}
