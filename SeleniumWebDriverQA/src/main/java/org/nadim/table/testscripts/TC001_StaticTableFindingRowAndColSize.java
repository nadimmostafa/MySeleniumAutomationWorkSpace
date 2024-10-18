package org.nadim.table.testscripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC001_StaticTableFindingRowAndColSize {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/");
		
		//finding table row size including table row
		int rowSize = driver.findElements(By.xpath("//table[@id='table1']//tr")).size();
		
		//finding table column*row size including table heading
		int rowColSize = driver.findElements(By.xpath("//table[@id='table1']//tr/*")).size();
		
		// finding table column size
		int colSize = driver.findElements(By.xpath("//table[@id='table1']//tr[1]/th")).size();
		
		System.out.println("Total table row is: "+rowSize +" and table column is: "+colSize);
		
		driver.close();
	}

}
