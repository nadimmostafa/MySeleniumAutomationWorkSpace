package org.nadim.options;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class TC007_ChangeDownloadDirectory {

	public static void main(String[] args) {

		String path = System.getProperty("user.dir")+File.separator+"downloadFile";
		Map<String, Object> prefs = new HashMap<>();
		prefs.put("download.default_directory", path);

		ChromeOptions option = new ChromeOptions();
		option.setExperimentalOption("prefs", prefs);

		WebDriver driver = new ChromeDriver(option);
		driver.get("https://the-internet.herokuapp.com/download");

		WebElement fileElement = driver.findElement(By.linkText("testfile.txt"));
		
		String fileName = fileElement.getText();
		fileElement.click();
		
		
		//check file is downloaded or not
		File f = new File(path);
		if(f.exists()) {
			String[] list = f.list();
			
			for(String l:list) {
				if(l.equals(fileName)) {
					System.out.println("File Downloaded and Test is passed.");
					break;
				}
			}
		}
		
	}

}
