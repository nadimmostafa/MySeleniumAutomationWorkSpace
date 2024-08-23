package org.nadim.basic.testscripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC020_CheckElementIsPresentOrNotInWebpage {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/");
		
		if(driver.findElement(By.linkText("Page One")).isDisplayed()) {
			System.out.println("Element is Present");
		}else {
			System.out.println("Element is Present");
		}
		
		driver.close();
	}

}
