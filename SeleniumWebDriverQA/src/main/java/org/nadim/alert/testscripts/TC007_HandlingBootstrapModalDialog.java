package org.nadim.alert.testscripts;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TC007_HandlingBootstrapModalDialog {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://getbootstrap.com/docs/4.0/components/modal/");
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(20));
		WebElement modalDialog = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@data-target='#exampleModalLive']")));
		modalDialog.click();
		
		WebElement textE = driver.findElement(By.xpath("//*[@id=\"exampleModalLive\"]/div/div/div[2]/p"));
		Thread.sleep(10000);
		System.out.println(textE.getText());
		
		driver.findElement(By.xpath("(//button[@class='close'])[2]/span")).click();
		
		driver.close();
	}

}
