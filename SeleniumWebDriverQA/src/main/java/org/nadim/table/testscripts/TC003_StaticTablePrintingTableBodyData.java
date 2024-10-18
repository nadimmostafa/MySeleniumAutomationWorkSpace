package org.nadim.table.testscripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC003_StaticTablePrintingTableBodyData {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/");
		
		//finding table row size including table row
		int rowSize = driver.findElements(By.xpath("//table[@id='table1']//tbody/tr")).size();
		
		//finding table column size including table heading
		int colSize = driver.findElements(By.xpath("//table[@id='table1']//tbody/tr[1]/td")).size();
		System.out.println("Total table row is: "+rowSize +" and table column is: "+colSize);
		
		for(int i=1;i<=rowSize;i++) {
			for(int j=1; j<=colSize;j++) {
				String data = driver.findElement(
						By.xpath("//table[@id='table1']//tbody/tr["+i+"]/td["+j+"]"))
						.getText();
				System.out.println(data);
				
			}
			
			System.out.println("======= Row ========");
		}
		
		driver.close();
	}

}
