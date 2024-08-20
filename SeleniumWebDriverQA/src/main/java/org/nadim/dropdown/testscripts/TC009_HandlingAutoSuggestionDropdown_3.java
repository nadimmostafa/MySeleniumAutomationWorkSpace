package org.nadim.dropdown.testscripts;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TC009_HandlingAutoSuggestionDropdown_3 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		// driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));
		searchBox.click();
		searchBox.sendKeys("l");

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("s-heavy")));

		List<WebElement> items = driver
				.findElements(By.xpath("//div[@class='left-pane-results-container']/div/div/div[@role='button']"));

		String itemName="lip balm";
		
		for (WebElement item : items) {
			if(item.getAttribute("aria-label").equals(itemName)) {
				item.click();
				
				// if we not write break then we will get StateReferenceException
				break;
			}
		}
		
		driver.close();
	}

}
