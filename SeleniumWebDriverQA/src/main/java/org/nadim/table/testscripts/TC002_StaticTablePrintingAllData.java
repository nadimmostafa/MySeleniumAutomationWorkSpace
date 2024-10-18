package org.nadim.table.testscripts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC002_StaticTablePrintingAllData {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/");

		List<WebElement> tableDatas = driver.findElements(By.xpath("//table[@id='table1']//tr/*"));
		for (WebElement data : tableDatas) {
			System.out.println(data.getText());
		}
		
		driver.close();
	}

}
