package org.nadim.dropdown.testscripts;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC006_HandlingBootStrapDropdown3 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("http://seleniumpractise.blogspot.com/2016/08/bootstrap-dropdown-example-for-selenium.html");
		driver.findElement(By.xpath("//div[@class='dropdown']/button")).click();
		
		List<WebElement> dropdownItems = driver.findElements(By.xpath("//li[@role='presentation']/a"));
		
		for(WebElement item:dropdownItems) {
			
			System.out.println(item.getText());
			if(item.getText().equals("JavaScript")) {
				item.click();
				break;
			}
		}
		
		driver.close();
	}

}
