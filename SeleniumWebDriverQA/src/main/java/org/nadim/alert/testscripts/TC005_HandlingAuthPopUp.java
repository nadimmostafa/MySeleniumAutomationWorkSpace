package org.nadim.alert.testscripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//Passing credentials in the URL
public class TC005_HandlingAuthPopUp {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
		
		WebElement text = driver.findElement(By.xpath("//div[@class=\"example\"]/p"));
		System.out.println(text.getText());
		
		driver.close();
	}

}
